package step28.ex6;

import java.sql.Date;
import java.util.List;

public class Project {
  int no;
  String titl;
  String content;
  Date startDate;
  Date endDate;
  String photoPath;
  List<Member> members;
  
  
  
  @Override
  public String toString() {
    return "Project [no=" + no + ", titl=" + titl + ", content=" + content + ", startDate=" + startDate + ", endDate="
        + endDate + ", photoPath=" + photoPath + ", members=" + members + "]";
  }
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitl() {
    return titl;
  }
  public void setTitle(String titl) {
    this.titl = titl;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
  public String getPhotoPath() {
    return photoPath;
  }
  public void setPhotoPath(String photoPath) {
    this.photoPath = photoPath;
  }
  public List<Member> getMembers() {
    return members;
  }
  public void setMembers(List<Member> members) {
    this.members = members;
  }
 
 
}
