import java.util.*;
import java.util.stream.Collectors;
class Product{
	int id;
	String name;
	float price;

	public Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class streamA{
	public static void main(String[] args){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP",25000f));
		productList.add(new Product(1,"Lenovo",50000f));

		List<Float> myList = productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		// List<Float> product2 = productList.stream().filter(p->p.price > 30000).map(p->p.price).collect(Collectors.toList());

		System.out.println(myList);
	}
}


// import java.util.stream.Collectors;
// import java.util.*;
// class Product{
// 	int id;
// 	float price;
// 	String name;

// 	public Product(int id, String name, float price ){
// 		this.id = id;
// 		this.name = name;
// 		this.price = price;
// 	}
// };
// public class StreamAPI{
// 	public static void main(String[] args){
// 	ArrayList<Product> productList = new ArrayList<Product>();
// 	productList.add(new Product(1,"Hp",36000f));


// 	List<Float> product2 = productList.stream().filter(p->p.price > 30000).map(p->p.price).collect(Collectors.toList());

// 	System.out.println(product2);
// }