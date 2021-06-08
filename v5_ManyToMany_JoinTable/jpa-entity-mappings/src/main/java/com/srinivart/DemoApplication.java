package com.srinivart;

import com.srinivart.entity.Customer;
import com.srinivart.entity.Item;
import com.srinivart.repository.CustomerRepository;
import com.srinivart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;

	@Override
	public void run(String... args) throws Exception {


		Customer customer = new Customer("srini");
		Customer customer1 = new Customer("teju");

		Set<Item> items= new HashSet<>();
		items.add(new Item("mobile",10000));
		items.add(new Item("laptop",45000));

		customer.setItemsSet(items);

        customerRepository.save(customer);

        customer1.getItemsSet().add(new Item("camera",25000));
		customerRepository.save(customer1);











//		Item item1 = new Item("ipad", 85000);
//		Item item2 = new Item("iphone", 65000);
//
//		Customer c1 = new Customer("srini");
//		Customer c2 = new Customer("teju");
//
//
//		item1.getCustomersSet().add(c1);
//		item1.getCustomersSet().add(c2);
//
//		c1.getItemsSet().add(item2);
//		c1.getItemsSet().add(item1);
//		c2.getItemsSet().add(item1);
//
//
//		customerRepository.save(c1);
//		customerRepository.save(c2);
//
//		itemRepository.save(item1);
//		itemRepository.save(item2);













//		Set<Customer> custSet = new HashSet<>();
//		custSet.add(new Customer("srini"));
//		custSet.add(new Customer("teju"));



//		customerRepository.saveAll(custSet);
//
//
//		item2.addAllCustomers(custSet);
//
//		itemRepository.save(item2);

		//item2.setCustomtersSet(custSet);

		//itemRepository.save(item2);



//		Item item2 = new Item("ipad", 85000);
//
//		Set<Customer> custSet = new HashSet<>();
//
//		custSet.add(new Customer("srini"));
//		custSet.add(new Customer("teju"));
//
//		item2.setCustomtersSet(custSet);
//		itemRepository.save(item2);


//		Customer customer = new Customer("srini");
//		Customer customer1 = new Customer("teju");
//
////		Set<Item> items= new HashSet<>();
////		items.add(new Item("mobile",10000));
////		items.add(new Item("laptop",45000));
////
////		customer.setItemsSet(items);
////        customerRepository.save(customer);
//
//
//        Set<Customer> custSet = new HashSet<>();
//        custSet.add(customer);
//        custSet.add(customer1);
//
//        Item item2 = new Item("ipad", 85000);
//        item2.setCustomtersSet(custSet);
//
//        itemRepository.save(item2);

	}
}




/*

		Item item1 = new Item("mobile",10000);
		Item item2 = new Item("laptop",45000);

		Set<Item> items= new HashSet<>();
		items.add(item1);
		items.add(item2);

 */