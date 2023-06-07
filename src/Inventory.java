import java.util.HashMap;

public class Inventory {

    // Inventory class will utilize a hashmap to store the item objects, and their quantities. 
    // The hashmap will be initialized in the constructor. 
    // The hashmap will be updated when items are added or removed from the inventory.

    HashMap<Item, Integer> inventory = new HashMap<Item, Integer>();

    // The Inventory class should initialize with the current inventory of items. 
    // This will be a hashmap of item objects and their quantities.
    public Inventory() {
        
}
