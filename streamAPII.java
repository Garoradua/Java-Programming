import java.util.*;
import java.util.stream.Collectors;
class Product{
	int id;
	String name;
	float price;
	Product(int id, String name, float price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
class streamAPII{
	public static void main(String[] args){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP",50000f));
		List<Float> priceList = productList.stream().filter(p->p.price>30000f).map(p->p.price).collect(Collectors.toList());

		System.out.println(priceList);

		}
}