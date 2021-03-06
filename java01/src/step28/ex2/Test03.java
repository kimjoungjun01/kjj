package step28.ex2;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class Test03 {

  public static void main(String[] args) throws Exception{
    InputStream inputStream = Resources.getResourceAsStream("step28/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
    MemberDaoImpl memberDao = new MemberDaoImpl();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    Member m = memberDao.selectOneByEmailPassword("wwww", "");
      System.out.println(m);
     
  }

}
