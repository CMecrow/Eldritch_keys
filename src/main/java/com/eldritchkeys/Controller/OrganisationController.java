package com.eldritchkeys.Controller;

import com.eldritchkeys.Model.Organisation;
import com.eldritchkeys.Repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganisationController {

    @Autowired
    OrganisationRepository repository;

    @GetMapping("/org")
    public ModelAndView orgPage() {
        ModelAndView modelAndView = new ModelAndView("/org");
        Iterable<Organisation> organisation = repository.findAll();
        modelAndView.addObject("organisation", organisation);
        return modelAndView;
    }
}
