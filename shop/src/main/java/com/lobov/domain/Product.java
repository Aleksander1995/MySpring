package com.lobov.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by alex1_000 on 06.10.2016.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="product_name")
    private String productName;

    @Column(name="price")
    private double price;

    @Column(name ="category")
    private String category;

    @Column(name="weight")
    private int weight;

    @Column(name="volume")
    private String volume;

    @Column(name="amount")
    private int amount;

    @Column(name="image_path")
    private String imagePath;

    public Product(){

    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getWeight() {
        return weight;
    }

    public String getVolume() {
        return volume;
    }

    public int getAmount() {
        return amount;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }


}