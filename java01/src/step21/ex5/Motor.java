package step21.ex5;

public abstract class Motor {
  float ampere;
  int rpm;
  float watt;
  
  public Motor() {}
  
  public Motor(float ampere, int rpm, float watt) {
    this.ampere = ampere;
    this.rpm = rpm;
    this.watt = watt;
  }
}
