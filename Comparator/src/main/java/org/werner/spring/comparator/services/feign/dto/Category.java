package org.werner.spring.comparator.services.feign.dto;

import java.util.List;

/**
 * Created by Werner on 2016/11/18.
 */
public class Category {
    String categoryName;
    String catoryDescription;
    List<Product> products;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCatoryDescription() {
        return catoryDescription;
    }

    public void setCatoryDescription(String catoryDescription) {
        this.catoryDescription = catoryDescription;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
