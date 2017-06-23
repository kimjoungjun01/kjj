package step27.ex8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
  String model;
  int cc;
  @Autowired Engine engine;
  
  


  @Override
  public String toString() {
    return "Car [model=" + model + ", cc=" + cc + ", engine=" + engine + "]";
  }

  public Car() {
    System.out.println("Car()");
    this.model = "기본자동차";
    this.cc = 900;
  }
  
  public Car(String model, int cc) {
    System.out.println("Car(String, int)");
    this.model = model;
    this.cc = cc;
  }
  
  public Car(String model, int cc, Engine engine) {
    System.out.println("Car(String, int)");
    this.model = model;
    this.cc = cc;
    this.engine = engine;
    
  }
  
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    System.out.println("set모델");

    this.model = model;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {
    System.out.println("set씨씨");

    this.cc = cc;
  }
  
}
