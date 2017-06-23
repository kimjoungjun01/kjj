package step28.ex5;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDaoImpl implements MemberDao{
  @Autowired
  SqlSessionFactory sqlSessionFactory;
  
  public List<Member> selectList(int pageNo, int pageSize, String serch, String value) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      HashMap<String,Object> valueMap = new HashMap<>();
      valueMap.put("start", (pageNo - 1) * pageSize);
      valueMap.put("pageSize", pageSize);
      valueMap.put("serch", serch);
      valueMap.put("value", value);
      
      return sqlSession.selectList("step28.ex5.MemberDao.selectList", valueMap);
                                                                    //이 자리는 오브젝트타입만 가능
      //MemberDao.xml 로 정보를 넘긴다
    } finally {
      sqlSession.close();
    }
    
  }
  
  public List<Member> selectListByNames(int pageNo, int pageSize, String[] names )throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      HashMap<String,Object> valueMap = new HashMap<>();
      valueMap.put("start", (pageNo - 1) * pageSize);
      valueMap.put("pageSize", pageSize);
      valueMap.put("names", names);
      
      return sqlSession.selectList("step28.ex5.MemberDao.selectListByNames", valueMap);
                                                                    //이 자리는 오브젝트타입만 가능
      //MemberDao.xml 로 정보를 넘긴다
    } finally {
      sqlSession.close();
    }
    
  }
  
  public Member selectOne(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      return sqlSession.selectOne("step28.ex5.MemberDao.selectOne", no);
                                               //                여기는 오브젝트타입이 들어와야된다 
                                                 //               no가 들어올 수 있는 이유? 오토박싱
    } finally {  
      sqlSession.close();
    }
  }
//
  public Member selectOneByEmailPassword(String email, String password) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    try {
      HashMap<String,Object> valueMap = new HashMap<>();
      valueMap.put("email", email);
      valueMap.put("password", password);

      return sqlSession.selectOne("step28.ex5.MemberDao.selectOneByEmailPassword", valueMap);
                                               //                여기는 오브젝트타입이 들어와야된다 
                                                 //               no가 들어올 수 있는 이유? 오토박싱
    } finally {  
      sqlSession.close();
    }
  }
//  
  public int insert(Member member) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
                                                         //여기 true를 주면 오토커밋이됨
    
    try {
      int count = sqlSession.insert("step28.ex5.MemberDao.insert", member);
      
      sqlSession.commit(); //insert, delete, update한 후에는 최종명령을 보내야만 실행이 완료됨
      return count;
    } finally {  
      sqlSession.close();
    }
  }
  
  public int delete(int no) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      int count = sqlSession.delete("step28.ex5.MemberDao.delete", no);

      sqlSession.commit(); //insert, delete, update한 후에는 최종명령을 보내야만 실행이 완료됨
      return count;
    } finally {  
      sqlSession.close();
    }
  }

  public int update(Member member) throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();

    try {
      int count = sqlSession.update("step28.ex5.MemberDao.update", member);

      sqlSession.commit(); //insert, delete, update한 후에는 최종명령을 보내야만 실행이 완료됨
      return count;
    } finally {  
      sqlSession.close();
    }
  }
//  
  
}