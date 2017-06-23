
create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);
alter table t2
    add constraint primary key (no);

alter table t2
  add column tel varchar(10);

alter table t2
  add column fax varchar(10),
  add column email varchar(50),
  add column mobile varchar(10);

alter table t2
  drop column email;
alter table t2
  drop fax;
