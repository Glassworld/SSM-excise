CREATE TABLE product(  id varchar2(32) default SYS_GUID() PRIMARY KEY,  productNum VARCHAR2(50) NOT NULL,  productName VARCHAR2(50),  cityName VARCHAR2(50),  DepartureTime timestamp,  productPrice Number,  productDesc VARCHAR2(500),  productStatus INT,  CONSTRAINT product UNIQUE (id, productNum) );
select * from product;
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice, productdesc, productstatus) values ('676C5BD1D35E429A8C2E114939C5685A', 'itcast-002', '����������', '����', to_timestamp('1010-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '����������', 1); 
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice, productdesc, productstatus) values ('12B7ABF2A4C544568B0A7C69F36BF8B7', 'itcast-003', '�Ϻ�������', '�Ϻ�', to_timestamp('2504-2018 14:30:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1800, 'ħ��������', 0); 
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice, productdesc, productstatus) values ('9F71F01CB448476DAFB309AA6DF9497F', 'itcast-001', '����������', '����', to_timestamp('1010-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '����������', 1);
select * from product
select username,default_tablespace from dba_users;
select * from product where productNum = 'itcast-001';