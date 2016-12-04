package org.werner.spring.comparator.services.feign.dto;

/**
 * Created by Werner on 2016/11/18.
 */
public class Product {
    String productName;
    String productDescrition;
    String productThumbnail;
    String price;
    Review review;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescrition() {
        return productDescrition;
    }

    public void setProductDescrition(String productDescrition) {
        this.productDescrition = productDescrition;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }

    public void setProductThumbnail(String productThumbnail) {
        this.productThumbnail = productThumbnail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
