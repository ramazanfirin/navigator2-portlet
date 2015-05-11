create index IX_71132316 on Order (organizationId);
create index IX_CAAE6F63 on Order (vehicleId);

create index IX_CF241CD1 on Poi (name, organizationId);
create index IX_79997F12 on Poi (organizationId);

create index IX_A13BB774 on Vehicle (organizationId);
create index IX_AEEC77D6 on Vehicle (plate, organizationId);

create index IX_10D0C8DD on brach (name, organizationId);

create index IX_C198EDFA on device (imei, organizationId);
create index IX_5A1B303E on device (organizationId);