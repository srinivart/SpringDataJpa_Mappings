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

		Set<Item> items= new HashSet<>();

		items.add(new Item("mobile",10000));
		items.add(new Item("laptop",45000));

		customer.setItems(items);

        customerRepository.save(customer);

	}
}




/*

		Item item1 = new Item("mobile",10000);
		Item item2 = new Item("laptop",45000);

		Set<Item> items= new HashSet<>();
		items.add(item1);
		items.add(item2);

 */