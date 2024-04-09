import java.util.*;
import java.util.stream.Collectors;
class Product{
	int id;
	float price;
	String name;

	public Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamAPIII{
	public static void main(String[] args){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Lenovo", 30000f));
		productList.add(new Product(1,"HP",40000f));

		List<Float> myList = productList.stream().filter(p->p.price > 35000).map(p->p.price).collect(Collectors.toList());

		System.out.println(myList);
	}
}