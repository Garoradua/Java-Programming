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