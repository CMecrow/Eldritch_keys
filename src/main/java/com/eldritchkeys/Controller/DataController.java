package com.eldritchkeys.Controller;

import com.eldritchkeys.Model.Customers;
import com.eldritchkeys.Model.Materials;
import com.eldritchkeys.Model.Vendors;
import com.eldritchkeys.Repository.CustomersRepository;
import com.eldritchkeys.Repository.MaterialsRepository;
import com.eldritchkeys.Repository.VendorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataController {

    @Autowired
    MaterialsRepository materialsRepository;
    @Autowired
    VendorsRepository vendorsRepository;
    @Autowired
    CustomersRepository customersRepository;

    @GetMapping("/data")
    public ModelAndView orgPage() {
        ModelAndView modelAndView = new ModelAndView("/data");
        Iterable<Materials> materials = materialsRepository.findAll();
        Iterable<Vendors> vendors = vendorsRepository.findAll();
        Iterable<Customers> customers = customersRepository.findAll();
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("vendors", vendors);
        modelAndView.addObject("materials", materials);
        return modelAndView;
    }
}