package org.werner.spring.comparator.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Werner on 2016/10/14.
 */
@Controller
public class LandingView {
    /**
     * Loads the main landing page
     * @param model
     */
    @GetMapping("/")
    public ModelAndView loadPage(Map<String, Object> model) {
        model.put("name", "Werner");
        return new ModelAndView("comparator.home", model);
    }
}
