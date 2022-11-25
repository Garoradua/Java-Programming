
import java.util.stream.Collectors;
import java.util.*;
class Product{
	int id;
	float price;
	String name;

	public Product(int id, String name, float price ){
		this.id = id;
		this.name = name;
		this.price = price;
	}
};
public class StreamAPI{
	public static void main(String[] args){
	ArrayList<Product> productList = new ArrayList<Product>();
	productList.add(new Product(1,"Hp",36000f));


	List<Float> product2 = productList.stream().filter(p->p.price > 30000).map(p->p.price).collect(Collectors.toList());

	System.out.println(product2);
}
}