package com.eldritchkeys.Controller;

import com.eldritchkeys.Model.Organisation;
import com.eldritchkeys.Model.Products;
import com.eldritchkeys.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @Autowired
    ProductsRepository productsRepository;

    @GetMapping("/")
    public ModelAndView landingPage() {
        ModelAndView modelAndView = new ModelAndView("/index");
        Iterable<Products> products = productsRepository.findAll();
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
