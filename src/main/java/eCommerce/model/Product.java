package eCommerce.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String name;
    private String description;
    private String picturePath;
    private BigDecimal price;

    public Product(String name, String description, String picturePath, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.picturePath = picturePath;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
