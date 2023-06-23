package com.logisti.inventorymanagementsystem;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class Inventory {

    // Inventory class will utilize a hashmap to store the item objects, and their quantities. 
    // The hashmap will be initialized in the constructor. 
    // The hashmap will be updated when items are added or removed from the inventory.
    

    private HashMap<Item, Integer> inventory = new HashMap<Item, Integer>();

    

    // The Inventory class should initialize with the current inventory of items. 
    // Current inventory will be loaded in from a file.
    public Inventory() {

        
    }
    public HashMap<Item, Integer> getInventory() {
        return inventory;
    }
    // Add item to inventory
    public void addItem(Item item, int quantity) {
        inventory.put(item, quantity);
    }
    // Remove item from inventory
    public void removeItem(Item item) {
        inventory.remove(item);
    }
    // Remove a specific quantity of an item from inventory
    public void removeAmountFromItem(Item item, int quantity) {
        int currentQuantity = inventory.get(item);
        if (currentQuantity > quantity) {
            inventory.put(item, currentQuantity - quantity);
        }
        else {
            inventory.remove(item);
        }
    }
}