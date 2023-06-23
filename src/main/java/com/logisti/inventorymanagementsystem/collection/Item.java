package com.logisti.inventorymanagementsystem.collection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Item {
    private String name;
    private String description;
    private int price;
    private int quantity;
    private int cost;
    private int sku;
    private int weight;
    private int length;
    private int width;
    private int height;
    private int category;
    private int subcategory;

    public Item() {
        super();
        System.out.println("Item created");
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription() {
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice() {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity() {
        this.quantity = quantity;
    }
    public int getCost() {
        return cost;
    }
    public void setCost() {
        this.cost = cost;
    }
    public int getSku() {
        return sku;
    }
    public void setSku() {
        this.sku = sku;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight() {
        this.weight = weight;
    }
    public int getLength() {
        return length;
    }
    public void setLength() {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth() {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight() {
        this.height = height;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory() {
        this.category = category;
    }
    public int getSubcategory() {
        return subcategory;
    }
    public void setSubcategory() {
        this.subcategory = subcategory;
    }
    public void show() {
        System.out.println("Showing item");
    }
}
