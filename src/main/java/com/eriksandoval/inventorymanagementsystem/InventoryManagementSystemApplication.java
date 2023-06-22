package com.eriksandoval.inventorymanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.eriksandoval.inventorymanagementsystem.collection.Item;

@SpringBootApplication
public class InventoryManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InventoryManagementSystemApplication.class, args);

		Item item = context.getBean(Item.class);
		item.show();
	}

}
