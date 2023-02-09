package esercizio.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MainProject {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1l, "Mario Rossi", 2);
		Customer c2 = new Customer(2l, "Giuseppe Verdi", 1);
		
		List<Product> products1 = Arrays.asList(
						new Product(1l, "Iphone", "Smartphone", 900.00),	
						new Product(2l, "Il Sig. Degli Anelli", "Books", 35.00),
						new Product(3l, "Batman", "Books", 101.00)
				);
		List<Product> products2 = Arrays.asList(
				new Product(1l, "Iphone", "Smartphone", 900.00),	
				new Product(2l, "Il Sig. Degli Anelli", "Toys", 35.00),
				new Product(3l, "Batman", "Toys", 101.00),
				new Product(4l, "Sanremo", "Baby", 3.00),
				new Product(5l, "Java", "Books", 150.00),
				new Product(5l, "Ciuccio", "Baby", 2.50)
		);		
		
		
		Order o1 = new Order(
							1l, 
							"PAGATO", 
							LocalDate.of(2021, 2, 2), 
							LocalDate.of(2021, 2, 5), 
							products1, 
							c1);
		Order o2 = new Order(
				1l, 
				"PAGATO", 
				LocalDate.of(2021, 2, 20), 
				LocalDate.of(2021, 2, 20), 
				products2, 
				c2);
		
		List<Order> listaOrdini = Arrays.asList(o1, o2);

		List<Product> filterProducts = getListBooksOver100(products2);
		//filterProducts.forEach(ele -> System.out.println(ele));
		
		List<Order> filterOrder = getListOrderBaby(listaOrdini);
		//filterOrder.forEach(ele -> System.out.println(ele));
		
		List<Product> filterProductswith10 = getListBoysDiscount10(products2);
		//filterProductswith10.forEach(ele -> System.out.println(ele));
		
		List<Product> filterProductTier = getProductTier(listaOrdini);
		filterProductTier.forEach(ele -> System.out.println(ele));
	}
	
	public static List<Product> getListBooksOver100(List<Product> lista) {
		//Ottenere una lista di prodotti che appartengono 
		//alla categoria «Books» ed hanno un prezzo > 100

		return lista
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());
	}
	
	public static List<Order> getListOrderBaby(List<Order> lista) {
		//Ottenere una lista di ordini con prodotti che 
		//appartengono alla categoria «Baby»

		return lista
			.stream()
			.filter(o ->  
						o.getProducts()
						.stream()
						.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
			.collect(Collectors.toList());
			
	}

	public static List<Product> getListBoysDiscount10(List<Product> lista){
		// Ottenere una lista di prodotti che appartengono 
		//alla categoria «Toys» ed applicare 10% di sconto al loro prezzo
		
		return lista
			.stream()
			.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
			.map(p -> {
				p.setPrice(p.getPrice()*0.9);
				return p;
			})
			.collect(Collectors.toList());

	}

	public static List<Product> getProductTier(List<Order> lista) {
		//Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 
		//tra l’01-Feb-2021 e l’01-Apr-2021
		return lista
			.stream()
			.filter(o -> o.getCustomer().getTier() == 2)
			.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
			.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
			.flatMap(o -> o.getProducts().stream())
			.distinct()
			.collect(Collectors.toList());
	}

}
