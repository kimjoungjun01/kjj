package step28.ex3;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class Test02 {

  public static void main(String[] args) throws Exception{
    InputStream inputStream = Resources.getResourceAsStream("step28/ex3/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
    MemberDaoImpl memberDao = new MemberDaoImpl();
    memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    List<Member> list = memberDao.selectListByNames(1, 100, new String[]{"강사1", "강사2", "강사4"});
    for(Member m : list) {
      System.out.printf("%d, %s, %s, %s\n", m.getNo(), m.getName(), m.getEmail(), m.getTel());
    }
  }

}
