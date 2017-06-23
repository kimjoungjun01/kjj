package step28.ex2;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class Test07 {

  public static void main(String[] args) throws Exception{
    InputStream inputStream = Resources.getResourceAsStream("step28/ex2/mybatis-config.xml");
//    InputStream inputStream = Resources.getResourceAsStream("step28/ex2/mybatis-config-01.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
    MemberDaoImpl memberDao = new MemberDaoImpl();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    List<Member> list = memberDao.selectListByEmail(1, 100, "hong101@test.com");
    for(Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel());
    }
    
    System.out.println("------------------------------------------------------------------");
    
    list = memberDao.selectListByName(1, 100, "강사");
    for(Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel());
    }
    
   System.out.println("------------------------------------------------------------------");
    
    list = memberDao.selectListByTel(1, 100, "1112");
    for(Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel());
    }
    
    
  }

}