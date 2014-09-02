create table t_agency(agency_id number,agency_name varchar2(64),agency_code varchar2(30));
alter table T_AGENCY add constraint PK_T_AGENCY primary key (AGENCY_ID);
create table t_user(user_id number,user_name varchar2(64),user_account varchar2(64),PWD varchar2(32),agency_id number,role_id number,vaild_id number);
alter table T_USER add constraint PK_T_USER primary key (USER_ID);
alter table T_USER  add constraint FK_AGENCY_ID foreign key (AGENCY_ID)  references T_AGENCY (AGENCY_ID);