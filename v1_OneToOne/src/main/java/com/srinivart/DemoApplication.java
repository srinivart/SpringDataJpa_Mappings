package com.srinivart;

import com.srinivart.entity.Customer;
import com.srinivart.entity.Item;
import com.srinivart.repository.CustomerRepository;
import com.srinivart.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		Item item = new Item("mobile",10000);

		Customer customer = new Customer("srini");

		customer.setItem(item);
		customerRepository.save(customer);


	}
}
