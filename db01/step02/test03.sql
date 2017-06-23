create table t2 (
  no int primary key,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime
);

  insert into t2(no,name,gender,height,intro,birthday,regdate)
    values(1, '홍길순' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

  insert into t2(no,name,gender,height,intro,birthday,regdate)
    values(1, '홍길순' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

  insert into t2(name,gender,height,intro,birthday,regdate)
    values(1, '홍길순' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');


create table t2 (
  no int,
  name varchar(10),
  gender char(1),
  height numeric(4,1),
  intro text,
  birthday date,
  regdate datetime,
  constraint primary key (no)
);


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
