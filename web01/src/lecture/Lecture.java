package lecture;

public class Lecture {
  int no;
  int crmno;
  int mrno;
  String titl;
  String dscp;
  String sdt;
  String edt;
  int qty;
  int pric;
  String thrs;
  String name;
  @Override
  public String toString() {
    return "Lecture [no=" + no + ", crmno=" + crmno + ", mrno=" + mrno + ", titl=" + titl + ", dscp=" + dscp
        + ", sdt=" + sdt + ", edt=" + edt + ", qty=" + qty + ", pric=" + pric + ", thrs=" + thrs + "]";
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public int getCrmno() {
    return crmno;
  }
  public void setCrmno(int crmno) {
    this.crmno = crmno;
  }
  public int getMrno() {
    return mrno;
  }
  public void setMrno(int mrno) {
    this.mrno = mrno;
  }
  public String getTitl() {
    return titl;
  }
  public void setTitl(String titl) {
    this.titl = titl;
  }
  public String getDscp() {
    return dscp;
  }
  public void setDscp(String dscp) {
    this.dscp = dscp;
  }
  public String getSdt() {
    return sdt;
  }
  public void setSdt(String sdt) {
    this.sdt = sdt;
  }
  public String getEdt() {
    return edt;
  }
  public void setEdt(String edt) {
    this.edt = edt;
  }
  public int getQty() {
    return qty;
  }
  public void setQty(int qty) {
    this.qty = qty;
  }
  public int getPric() {
    return pric;
  }
  public void setPric(int pric) {
    this.pric = pric;
  }
  public String getThrs() {
    return thrs;
  }
  public void setThrs(String thrs) {
    this.thrs = thrs;
  }

}
