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
public class SAPI{
	public static void main(String[] args){
		ArrayList<Product> prod = new ArrayList<Product>();
		prod.add(new Product(1,"HP",50000f));

		List<Float> list2 = prod.stream().filter(p->p.price >30000).map(p->p.price).collect(Collectors.toList());

		System.out.println(list2);
	}
}