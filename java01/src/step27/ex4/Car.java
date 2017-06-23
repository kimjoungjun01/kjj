package step27.ex4;

import java.util.Arrays;
import java.util.Map;

public class Car {
  String model;
  int cc;
  Engine engine;
  Tire[] tires;
  Map<String,Object> options;
  
  


  @Override
  public String toString() {
    return "Car [model=" + model + ", cc=" + cc + ", engine=" + engine + ", tires=" + Arrays.toString(tires)
        + ", options=" + options + "]";
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
  
  
    
  public Map<String, Object> getOptions() {
    return options;
  }

  public void setOptions(Map<String, Object> options) {
    this.options = options;
  }

  public Tire[] getTires() {
    return tires;
  }

  public void setTires(Tire[] tires) {
    this.tires = tires;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    System.out.println("set엔진");
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
