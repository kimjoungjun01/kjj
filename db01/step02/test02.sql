create table t2 (
  no int,
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
  values(3.14, '홍길순' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(4, '12345678901' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(5, '가나다라마바사아자차' ,'w',160.5,'길순이....','1993-5-5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(6, '홍길순' ,'w',60.57,'길순이....','1993-5-5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(6, '홍길순' ,'w',22060.57,'길순이....','1993-5-5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(6, '홍길순' ,'w',2206,'길순이....','1993-5-5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(6, '홍길순' ,'w',220.6,'길순이....','1993-5-5 7:3:5','2017-4-17 15:23:11');

insert into t2(no,name,gender,height,intro,birthday,regdate)
  values(7, '홍길순' ,'w',220.6,'길순이....','1993-5-5','2017-4-17');
