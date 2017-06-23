
insert memb(mno, name, tel, email, pwd)
 values(40, '홍길동1', '1111-1111', 'hong1@test.com','1111');


insert memb(name,tel,email,pwd)
 values('홍길동2', '1111-1111', 'hong2@test.com','1111');


insert memb(name,tel,email,pwd)
 values('홍길동3', '1111-1111', 'hong3@test.com',password('1111'));

insert memb
 values(45, '홍길동4', '1111-1221', 'hong4@test.com',password('1111'));

insert tcher
select mno
 from memb
 where mno between 40 and 49;


update tcher set fcbk='okok', twit='nono' where tno=40;

update memb set pwd=password('1111');

delete from tcher where tno in (30,)
delete from memb where mno in (40,45)

delete from memb where mno = 41;
