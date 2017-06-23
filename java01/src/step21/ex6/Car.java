package step21.ex6;

public abstract class Car implements Vehicle {

  protected String model;
  protected String maker;
  protected int cc;

  public Car() { 
    super();
  }
   
  public Car(String model, String maker, int cc) {
    this.model = model;
    this.maker = maker;
    this.cc = cc;
  }
  
}