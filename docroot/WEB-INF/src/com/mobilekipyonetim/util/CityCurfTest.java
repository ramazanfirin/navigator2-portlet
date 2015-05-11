package com.mobilekipyonetim.util;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CityCurfTest {

	public static void main(String[] args) {
		try {
			//parseIlce();
			//getMahalleList("NO=124&AD=KEYKUBAT MAH.");
			//parseSokak();
			getBinaList("NO=257690&AD=");
			//getKapiNo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<SelectItem> getIlceList() throws Exception{
		String url = "http://cbs.kayseri.bel.tr/KIlce.aspx";
		List  <SelectItem> selectItemList = new ArrayList<SelectItem>();
		try {
			String result= Util.getUrl(url);
			
			Document doc = Jsoup.parse(result);
			Elements impress = doc.getElementsByClass("imgcursor");
			
			
			for (Iterator iterator = impress.iterator(); iterator.hasNext();) {
				Element element = (Element) iterator.next();
//			if(element.attributes().size()>0)
//				continue;

				String ilce  = new String(element.attr("title").getBytes(), "UTF-8");
				String onclick = element.attr("onclick");
				onclick = onclick.replace("JsMahGoster", "");
				onclick = onclick.replace("(", "");
				onclick = onclick.replace(")", "");
				onclick = onclick.replace("this.id,", "");
				onclick = onclick.replace(",this.title", "");
				onclick = onclick.replace(";", "");
			    
				//System.console().writer().println(ilce + " "+onclick);
				SelectItem item = new SelectItem("NO="+onclick+"&AD=",ilce);
				selectItemList.add(item);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return selectItemList;
	}
	
	public static List <SelectItem>  getMahalleList(String url1) throws Exception{
		String urlEncoded = URLEncoder.encode(url1, "UTF-8");
		String url = "http://cbs.kayseri.bel.tr/KMahalle.aspx?"+url1;
		List  <SelectItem> selectItemList = new ArrayList<SelectItem>();
		try {
			String result= Util.getUrl(url);
			
			Document doc = Jsoup.parse(result);
			Elements impress = doc.getElementsByAttributeValue("style", "border-width: 0px");
			for (Iterator iterator = impress.iterator(); iterator.hasNext();) {
				Element element = (Element) iterator.next();
				String mahalle  = new String(element.attr("title").getBytes(), "UTF-8");
				
				
			
				String onclick = element.attr("onclick");
				onclick = onclick.replace("JScsbmGetir", "");
				onclick = onclick.replace("(", "");
				onclick = onclick.replace(")", "");
				onclick = onclick.replace("this.id,", "");
				onclick = onclick.replace(",this.title", "");
				onclick = onclick.replace(";", "");
				
				System.out.println(mahalle+" "+onclick);
				SelectItem item = new SelectItem("NO="+onclick+"&AD=",mahalle);
				selectItemList.add(item);
			}
			
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return selectItemList;
	}
	

	public static List <SelectItem>  getSokakList(String url1) throws Exception{
		List  <SelectItem> selectItemList = new ArrayList<SelectItem>();
		String urlEncoded = URLEncoder.encode(url1, "UTF-8");
		String url = "http://cbs.kayseri.bel.tr/Kcsbm.aspx?"+url1;
		try {
			String result= Util.getUrl(url);
			
			Document doc = Jsoup.parse(result);
			Elements impress = doc.getElementsByClass("cursorhand");
			for (Iterator iterator = impress.iterator(); iterator.hasNext();) {
				Element element = (Element) iterator.next();
				String sokak  = new String(element.attr("title").getBytes(), "UTF-8");
				
				
			
				String onclick = element.attr("onclick");
				onclick = onclick.replace("JSKapiGetir", "");
				onclick = onclick.replace("(", "");
				onclick = onclick.replace(")", "");
				onclick = onclick.replace("this.id,", "");
				onclick = onclick.replace(",this.title", "");
				onclick = onclick.replace(";", "");
				
				if(!sokak.equals("") && !(sokak==null)){
					SelectItem item = new SelectItem("NO="+onclick+"&AD=",sokak);
					selectItemList.add(item);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return selectItemList;
	}
	
	public static List <SelectItem> getBinaList(String url1) throws Exception{
		String urlEncoded = URLEncoder.encode(url1, "UTF-8");
		String url = "http://cbs.kayseri.bel.tr/KBina.aspx?"+url1;
		List  <SelectItem> selectItemList = new ArrayList<SelectItem>();
		try {
			String result= Util.getUrl(url);
			Document doc = Jsoup.parse(result);
			Elements impress = doc.getElementsByClass("trAlternative");
			Elements impress2 = doc.getElementsByClass("trNormal");
			impress.addAll(impress2);
			
			for (Iterator iterator = impress.iterator(); iterator.hasNext();) {
				Element element = (Element) iterator.next();
				Elements elementList  =element.getElementsByAttributeValue("align", "left");
				
				//System.out.println(elementList.get(0).html());
				
				Elements onclickList =elementList.get(3).getElementsByAttribute("onclick");
				if(onclickList.size()==0)
					continue ;
							
				String onclik=onclickList.get(0).attr("onclick");
				
				onclik = onclik.replace("JSBinaCiz", "");
				onclik = onclik.replace("(", "");
				onclik = onclik.replace(")", "");
				onclik = onclik.replace("\"", "");
				
				String bina = elementList.get(0).html();
				
				SelectItem item = new SelectItem(onclik,bina);
				selectItemList.add(item);
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(selectItemList.size());
		return selectItemList;
	}
	
	public static void getKapiNo() throws Exception{
		
		//List<String> a =CityCurfUtil.getKapiNo("225960");
		List<SelectItem> ilceList  = getIlceList();
		System.out.println("bitti");
	}
}
