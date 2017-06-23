
create table t2 (
  no int primary key auto_increment,
  name varchar(10),
  email varchar(50)
);


create table t2 (
  no int,
  name varchar(10),
  email varchar(50)
);


alter table t2
  add constraint primary key (no);

alter table t2
  modify column no int auto_increment;

insert into t2(name,email) values('홍길동','hong@test.com');
insert into t2(name,email) values('홍길동2','hong@test2.com');
insert into t2(name,email) values('홍길동3','hong@test3.com');

delete from t2 where no=2;

insert into t2(name,email) values('홍길동4','hong@test4.com');
