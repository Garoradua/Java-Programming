// import java.util.*;
// import java.util.stream.Collectors;
// class Product{
// 	int id;
// 	String name;
// 	float price;

// 	Product(int id, String name, float price){
// 		this.id = id;
// 		this.name = name;
// 		this.price = price;
// 	}
// }
// class All{
// 	public static void main(String[] args){
// 		List<Product> ProductList = new ArrayList<Product>();
// 		ProductList.add(new Product(1,"HP",50000));
// 		ProductList.add(new Product(1,"hi",20000));

// 		List<Float> newList = ProductList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());

// 		System.out.println(newList);
// 	}
// }
class Thread1 implements Runnable{
	public void run(){
		while(true)
		System.out.println("Thread class 111111");
	}
}
class Thread2 implements Runnable{
	public void run(){
		while(true)
		System.out.println("Thread class 222222");
	}
}
class All{
	public static void main(String[] args){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		Thread h1 = new Thread(t1);
		Thread h2 = new Thread(t2);

		h1.start();
		h2.start();
	}
}