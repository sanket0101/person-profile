package com.nit.novadirectory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.novadirectory.domain.PersonProfile;
import com.nit.novadirectory.repository.PersonProfileRepository;


/**
 * Controller that handles requests for saving Person Profiles into MongoDB.
 * Application: Nova Directory App
 * Company: NovaDirectory
 */
@Controller
public class PersonProfileController {

    @Autowired
    private PersonProfileRepository repository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("profiles", repository.findAll());
        return "index";
    }

    @PostMapping("/register")
    public String register(PersonProfile profile) {
        repository.save(profile);
        return "redirect:/";
    }
}

