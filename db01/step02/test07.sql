
create table t2 (
  no int,
  name varchar(10) default'홍길동',
  gender char(1) not null default 'w',
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

alter table t2
    add constraint primary key (no);

 insert into t2(no,gender)
   values(1,'m');
 insert into t2(no)
   values(2);
