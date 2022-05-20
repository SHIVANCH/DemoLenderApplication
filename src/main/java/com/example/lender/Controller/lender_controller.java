package com.example.lender.Controller;


import com.example.lender.Model.Lender;
import com.example.lender.Repository.lender_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.Cacheable;

import java.util.Optional;

@SuppressWarnings("OptionalGetWithoutIsPresent")
@RestController

public class lender_controller {
    @Autowired
    lender_repo repo;


    @PostMapping("/lender/create_lender")
    public void create_lender(@RequestBody Lender lender) {
        repo.save(lender);
    }



    @GetMapping("/lender/getAll")
    @Cacheable(value = "Lenders")
    public Iterable<Lender> getAllLenders() {


        return repo.findAll();
    }


    @GetMapping("/lender/getById/{id}")
    @org.springframework.cache.annotation.Cacheable(value = "Lenders",key="#id")
    public Optional<Lender> getLenderById(@PathVariable int id) {

        System.out.println("Called getLenderById from DB ");

        return repo.findById(id);
    }


    @PutMapping("/lender/updated/{id}")
    @CachePut(value = "Lenders",key ="#lender.id")
    public void updateLender(@RequestBody Lender lender) {

        Optional<Lender> l = repo.findById(lender.getId());
        Lender newl = l.get();
        System.out.println(newl.getName());
        newl.setName(lender.getName());
        repo.save(newl);
        System.out.println(newl.getId());
        System.out.println(newl.getName());

    }

    @DeleteMapping("/lender/deleteById/{id}")
    @CacheEvict(value = "Lenders", key = "#id")
    public void deleteLenderById(@PathVariable int id) {
        repo.deleteById(id);
    }
}
