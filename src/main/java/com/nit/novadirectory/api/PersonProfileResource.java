package com.nit.novadirectory.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nit.novadirectory.domain.PersonProfile;
import com.nit.novadirectory.repository.PersonProfileRepository;

@RestController
@RequestMapping("/api/profiles")
public class PersonProfileResource {

    @Autowired
    private PersonProfileRepository repository;

    @GetMapping
    public List<PersonProfile> getAllProfiles() {
        return repository.findAll();
    }

    @PostMapping
    public PersonProfile createProfile(@RequestBody PersonProfile profile) {
        return repository.save(profile);
    }
}
