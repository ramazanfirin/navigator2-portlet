create table Order (
	orderEntityId INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	lat VARCHAR(75) null,
	lng VARCHAR(75) null,
	date_ DATE null,
	address VARCHAR(75) null,
	ilce VARCHAR(75) null,
	mahalle VARCHAR(75) null,
	sokak VARCHAR(75) null,
	bina VARCHAR(75) null,
	vehicleId LONG,
	statusId LONG,
	priorityId LONG
);

create table OrderPriority (
	orderPriorityEntityId INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	description VARCHAR(75) null
);

create table Poi (
	poiEntityId INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	organizationId LONG,
	name VARCHAR(75) null,
	lat VARCHAR(75) null,
	lng VARCHAR(75) null
);

create table Vehicle (
	vehicleEntityId INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	plate VARCHAR(75) null,
	organizationId LONG,
	deviceId LONG
);

create table brach (
	entityId INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	lat INTEGER,
	lng INTEGER,
	organizationId LONG
);

create table device (
	entityId INTEGER not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	msisdn VARCHAR(75) null,
	imei VARCHAR(75) null,
	regId VARCHAR(75) null,
	organizationId LONG
);