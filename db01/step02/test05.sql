
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

 insert into t2(no,name,gender,height,intro,birthday,regdate)
   values(1, '홍길순' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

 insert into t2(no,name,gender,height,intro,birthday,regdate)
   values(2, '홍길순이다' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

 insert into t2(no,name,gender,height,intro,birthday,regdate)
   values(3, '홍길순이라고한다' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');



 alter table t2
  change column name fst_nm varchar(10),
  add column lst_nm varchar(10);

alter table t2
  modify column fst_nm varchar(9);

alter table t2
  modify column fst_nm varchar(7);

alter table t2
  modify column height varchar(10);

alter table t2
  modify column gender int;
