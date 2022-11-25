import java.util.*;
import java.util.stream.Collectors;
class Product{
	int id;
	String name;
	float price;

	Product(int id, String name, float price){
		this.id  = id;
		this.name = name;
		this.price = price;
	}
}
class streamAPInew{
	public static void main(String[] args){
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Gourav",50000f));
		List<Float> list2 = productList.stream().filter(p->p.price >30000).map(p->p.price).collect(Collectors.toList());
	}
}