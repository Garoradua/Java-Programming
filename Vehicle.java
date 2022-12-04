// class PubicInherit{
// 	public void func(){
// 		System.out.println("Hello");
// 	}
// } 
// public class Inherit extends PublicInherit{
// 	public static void main(String args[]){
// 		Inherit obj;
// 		obj.func();
// 	}
	
// }

class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Vehicle myFastCar = new Vehicle();
    myFastCar.honk();
    // System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}



