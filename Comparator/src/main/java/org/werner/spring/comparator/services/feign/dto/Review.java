package org.werner.spring.comparator.services.feign.dto;

/**
 * Created by Werner on 2016/11/18.
 */
public class Review {
    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating='" + rating + '\'' +
                '}';
    }
}
