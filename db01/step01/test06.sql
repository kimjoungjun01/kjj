/* 서브 쿼리
=> 쿼리문 안에 쿼리문을 실행하는 기법
=> 성능 문제를 생각하면서 사용해야 한다.
*/

/*=> 수강신청번호, 강의제목, 교실이름, 매니저이름, 매니저직급, 수강생이름, 재직여부 */
select
  la.lano,
  l.titl,
  cr.name,
  m.name,
  mr.posi,
  m2.name,
  s.work
from lect_appy la
  inner join lect l on la.lno = l.lno
  left outer join croom cr on l.crmno = cr.crmno
  left outer join memb m on l.mrno = m.mno
  left outer join mgr mr on m.mno = mr.mrno
  left outer join memb m2 on la.sno = m2.mno
  left outer join stud s on la.sno = s.sno;




select mr.mrno, m.name
from mgr mr inner join memb m on mr.mrno=m.mno;

select lno,titl,mrno
from lect l;

select l.lno, l.titl, m.name
from lect l left outer join memb m on l.mrno=m.mno;


select l.lno, l.titl, t1.name
from lect l left outer join (select mr.mrno, m.name
from mgr mr inner join memb m on mr.mrno=m.mno
where m.name = '매니저1') t1 on l.mrno=t1.mrno;


select l.lno, l.titl, t1.name
from lect l inner join (select mr.mrno, m.name
from mgr mr inner join memb m on mr.mrno=m.mno
where m.name = '매니저1') t1 on l.mrno=t1.mrno;






/*
1) select 절(clause)에 서브쿼리 사용하기
*/
select
  la.lano,
  l.titl,
  (select name from croom where crmno=l.crmno) room,
  (select name from memb where mno=l.mrno) mname,
  (select posi from mgr where mrno=l.mrno) position,
  (select name from memb where mno=la.sno) sname,
  (select work from stud where sno=la.sno) working
from lect_appy la
  inner join lect l on la.lno = l.lno;


select l.lno,l.titl,l.crmno
from lect l

select crmno,name
from croom where name like "강남%";

select l.lno,l.titl,l.crmno
from lect l
where l.crmno in (select crmno from croom where name like "강남%");




/* */
