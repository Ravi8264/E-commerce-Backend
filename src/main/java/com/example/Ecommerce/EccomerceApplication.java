package com.example.Ecommerce;

import com.example.Ecommerce.model.Customer;
import com.example.Ecommerce.model.Enum.UserRole;
import com.example.Ecommerce.model.Login;
import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.CustomerService;
import com.example.Ecommerce.service.ProductService;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



@SpringBootApplication
public class EccomerceApplication {
	@PostConstruct
	public void logStartup() {
		System.out.println(">>> Application Started <<<");
	}

	public  void run(){
		System.out.println("Applictaion.......run");
	}

	public static void main(String[] args) {
		// SpringApplication.run(EccomerceApplication.class, args);
		ApplicationContext ap = SpringApplication.run(EccomerceApplication.class, args);
		ProductService productService = ap.getBean(ProductService.class);
		CustomerService customerService = ap.getBean(CustomerService.class);
//		List<Product> products = new ArrayList<>();
//		products.add(new Product("Samsung Galaxy S24", "Flagship smartphone", "Samsung",
//				new BigDecimal("84999.0"), "Mobile", true, 25, "s24.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("iPhone 15 Pro", "Apple's latest flagship", "Apple",
//				new BigDecimal("124999.0"), "Mobile", true, 15, "iphone15.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("OnePlus 12", "Fast performance phone", "OnePlus",
//				new BigDecimal("65999.0"), "Mobile", true, 20, "oneplus12.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("HP Pavilion 15", "Laptop with i5 12th Gen", "HP",
//				new BigDecimal("69999.0"), "Laptop", true, 10, "hp15.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Dell XPS 13", "Ultra portable laptop", "Dell",
//				new BigDecimal("109999.0"), "Laptop", true, 8, "xps13.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Asus ROG", "Gaming laptop", "Asus",
//				new BigDecimal("129999.0"), "Laptop", true, 5, "rog.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Sony WH-1000XM5", "Noise cancelling headphones", "Sony",
//				new BigDecimal("27999.0"), "Audio", true, 30, "sonyheadphones.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("boAt Airdopes 141", "Wireless earbuds", "boAt",
//				new BigDecimal("1999.0"), "Audio", true, 100, "boat141.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Samsung 43\" Smart TV", "4K UHD TV", "Samsung",
//				new BigDecimal("45999.0"), "TV", true, 12, "samsungtv43.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("LG 55\" OLED", "Premium OLED TV", "LG",
//				new BigDecimal("129999.0"), "TV", true, 6, "lg55.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Canon EOS 1500D", "DSLR Camera", "Canon",
//				new BigDecimal("39999.0"), "Camera", true, 7, "canon1500d.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Nike Revolution 5", "Running shoes", "Nike",
//				new BigDecimal("3499.0"), "Footwear", true, 50, "nike5.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Adidas Ultraboost", "Performance shoes", "Adidas",
//				new BigDecimal("8499.0"), "Footwear", true, 40, "adidasboost.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Puma Backpack", "Travel backpack", "Puma",
//				new BigDecimal("1799.0"), "Accessories", true, 60, "pumabackpack.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Ray-Ban Sunglasses", "UV Protection", "Ray-Ban",
//				new BigDecimal("5499.0"), "Accessories", true, 20, "rayban.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Apple Watch SE", "Smartwatch", "Apple",
//				new BigDecimal("27999.0"), "Wearable", true, 12, "awse.jpg", "image/jpeg", null, LocalDateTime.now()));
//		products.add(new Product("Realme Watch 3", "Budget smartwatch", "Realme",
//				new BigDecimal("2999.0"), "Wearable", true, 80, "realmewatch.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Philips Trimmer", "Beard trimmer", "Philips",
//				new BigDecimal("1299.0"), "Grooming", true, 70, "philipstrimmer.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Mi Power Bank", "20000mAh fast charging", "Mi",
//				new BigDecimal("2199.0"), "Gadgets", true, 90, "mipowerbank.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		products.add(new Product("Amazon Echo Dot", "Smart speaker", "Amazon",
//				new BigDecimal("4499.0"), "Gadgets", true, 35, "echodot.jpg", "image/jpeg", null, LocalDateTime.now()));

//		for (Product product : products) {
//			productService.add(product);
//		}
//		System.out.println("---------------------result---------------");
	//productService.getAll().forEach(v-> System.out.println(v));

//		System.out.println(productService.get(1));
//
//		productService.upd(1,new Product("Mi Power Bank1111", "20000mAh fast charging", "Mi",
//				new BigDecimal("2199.0"), "Gadgets", true, 90, "mipowerbank.jpg", "image/jpeg", null,
//				LocalDateTime.now()));
//		System.out.println("---------------------------------");
//		System.out.println(productService.get(1));

//		productService.del(40);
//    productService.find("Mobile").forEach(v-> System.out.println(v));

		// productService.getAll().forEach(v-> System.out.println(v));
		// productService.find("Samsung").forEach(v-> System.out.println(v))

//		 List<Customer> customers = List.of(
//		 new Customer(null, "Ravi", "ravi@example.com", "pass123", "9990000001",
//		 List.of(UserRole.USER)),
//		 new Customer(null, "Admin1", "admin1@example.com", "admin123", "9990000002",
//		 List.of(UserRole.ADMIN)),
//		 new Customer(null, "John", "john@example.com", "johnpass", "9990000003",
//		 List.of(UserRole.USER, UserRole.ADMIN)),
//		 new Customer(null, "Alice", "alice@example.com", "alice123", "9990000004",
//		 List.of(UserRole.USER)),
//		 new Customer(null, "Bob", "bob@example.com", "bobpass", "9990000005",
//		 List.of(UserRole.ADMIN)),
//		 new Customer(null, "Priya", "priya@example.com", "priya123", "9990000006",
//		 List.of(UserRole.USER)),
//		 new Customer(null, "Arjun", "arjun@example.com", "arjunpass", "9990000007",
//		 List.of(UserRole.USER, UserRole.ADMIN)),
//		 new Customer(null, "Meena", "meena@example.com", "meena123", "9990000008",
//		 List.of(UserRole.USER)),
//		 new Customer(null, "Kabir", "kabir@example.com", "kabir123", "9990000009",
//		 List.of(UserRole.ADMIN)),
//		 new Customer(null, "Dev", "dev@example.com", "devpass", "9990000010",
//		 List.of(UserRole.USER))
//		 );
//		 for (Customer c : customers) {
//		 customerService.signin(c);
//		 }
//		 customerService.getAll().forEach(System.out::println);
//		customerService.upd(1L, new Customer("Alice", "alice@example.com", "alice123", "9990000004",
//				List.of(UserRole.ADMIN,UserRole.USER)));
//	customerService.getAll().forEach(v-> System.out.println(v));

	customerService.login(new Login("alice@example888.com","alice123"));
	}

}
