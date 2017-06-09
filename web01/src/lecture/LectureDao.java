package lecture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LectureDao {
  DBConnectionPool conPool;

  public LectureDao(DBConnectionPool conPool) {
    this.conPool = conPool;
  }


  public List<Lecture> selectList(int pageNo, int pageSize) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement("select lno, titl, sdt, edt, qty, thrs from lect order by lno asc limit ?, ?");) {
      stmt.setInt(1, (pageNo - 1) * pageSize);
      stmt.setInt(2,  pageSize);


      ArrayList<Lecture> list = new ArrayList<>();

      try (ResultSet rs = stmt.executeQuery();) {
        Lecture lecture = null;
        while (rs.next()) {
          lecture = new Lecture();
          lecture.setNo(rs.getInt("lno"));
          lecture.setTitl(rs.getString("titl"));
          lecture.setSdt(rs.getString("sdt"));
          lecture.setEdt(rs.getString("edt"));
          lecture.setQty(rs.getInt("qty"));
          lecture.setThrs(rs.getString("thrs"));

          list.add(lecture);
        }
      }
      return list;

    } finally {
      conPool.returnConnection(con);
    }
  }
  
  public Lecture selectOne(int no) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement("select * from lect where lno=?");
        ){
      
        stmt.setInt(1, no);
      try (ResultSet rs = stmt.executeQuery();) {
        if (rs.next()) {
          Lecture lecture = new Lecture();
          lecture.setNo(rs.getInt("lno"));
          lecture.setCrmno(rs.getInt("crmno"));
          lecture.setMrno(rs.getInt("mrno"));
          lecture.setTitl(rs.getString("titl"));
          lecture.setDscp(rs.getString("dscp"));
          lecture.setSdt(rs.getString("sdt"));
          lecture.setEdt(rs.getString("edt"));
          lecture.setQty(rs.getInt("qty"));
          lecture.setPric(rs.getInt("pric"));
          lecture.setThrs(rs.getString("thrs"));
//          PreparedStatement stmt2 = con.prepareStatement("select * from croom where crmno=?");
//          stmt2.setInt(1, lecture.getCrmno());
//          ResultSet rs2 = stmt2.executeQuery();
//          lecture.setgetName(rs2.tName("name"));
          
          
          return lecture;

        } else {
          
          return null;
        }
      }

    } finally {
      conPool.returnConnection(con);
    }
  }

  public int insert(Lecture lecture) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement(
            "insert into lect(crmno, titl, dscp, sdt, edt, qty, pric, thrs) values(?,?,?,?,?,?,?,?)");) {
      
      stmt.setString(2, lecture.getTitl());
      stmt.setString(3, lecture.getDscp());
      stmt.setString(4, lecture.getSdt());
      stmt.setString(5, lecture.getEdt());
      stmt.setInt(6, lecture.getQty());
      stmt.setInt(7, lecture.getPric());
      stmt.setString(8, lecture.getThrs());


      return stmt.executeUpdate();
    } finally {
      conPool.returnConnection(con);
    }
  }

  public int delete(int no) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement(
            "delete from croom where crmno=?");
        ) {

      stmt.setInt(1, no);
      return stmt.executeUpdate();
    } finally {
      conPool.returnConnection(con);
    }

  }

  public int update(Lecture croom) throws Exception {
    Connection con = conPool.getConnection();

    try (
        PreparedStatement stmt = con.prepareStatement(
            "update croom set name=? where crmno=?");) {

//      stmt.setString(1, croom.setTitl());

      stmt.setInt(2, croom.getNo());

      return stmt.executeUpdate();
    } finally {
      conPool.returnConnection(con);
    }

  }



}
