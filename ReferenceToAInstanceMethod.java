interface instanceInterface{
    public void display();
}
class instanceClass{
    instanceClass(){
        System.out.println("Fun2 is calling");
    }
}
public class ReferenceToAInstanceMethod {
    public static void main(String[] args){
    instanceInterface obj1 = instanceClass::new;
		obj1.display();
    }
}
