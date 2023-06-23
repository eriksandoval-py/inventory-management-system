package com.logisti.inventorymanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.logisti.inventorymanagementsystem.collection.Item;

@SpringBootApplication
public class InventoryManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InventoryManagementSystemApplication.class, args);

		Item item0 = context.getBean(Item.class);
		item0.show();
		Item item1 = context.getBean(Item.class);
		item1.show();
	}

}
