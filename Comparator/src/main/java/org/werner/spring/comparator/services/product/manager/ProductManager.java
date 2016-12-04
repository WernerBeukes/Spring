package org.werner.spring.comparator.services.product.manager;

import org.werner.spring.comparator.services.feign.dto.Category;
import org.werner.spring.comparator.services.feign.dto.Partner;

import java.util.List;
import java.util.Map;

/**
 * Created by Werner on 2016/11/28.
 */
public interface ProductManager {
    /**
     * Reloads products from partners
     */
    void refresh();

    /**
     * Gets a list of all available partners
     * @return List<Partner>
     */
    List<Partner> getPartners();

    /**
     * Gets all available categories across all partners
     * @return List<Category>
     */
    List<Category> getCategories();

    /**
     * Gets categories returned for partner
     * @param partner
     * @return List<Category>
     */
    List<Category> getCategoriesBasedOnPartner(Partner partner);

    /**
     * Gets products from all partners based on category
     * @param category
     * @return Map<Partner, Product>
     */
    Map<Partner, List<Category>> getCategoryProducts(Category category);
}
