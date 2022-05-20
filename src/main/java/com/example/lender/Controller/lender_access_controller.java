package com.example.lender.Controller;

import com.example.lender.Model.Lender;
import com.example.lender.Model.Lender_Access_Token;
import com.example.lender.Repository.lender_access_token_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class lender_access_controller {

    @Autowired
    lender_access_token_repo rep;

    @GetMapping(path = "/lender/getAllAccessToken")
    public Iterable<Lender_Access_Token> getAllAccessToken()
    {
        return rep.findAll();
    }

    @GetMapping(path = "/lender/getAccessToken/{id}")
    public Optional<Lender_Access_Token> getLenderAccessToken(@PathVariable int id)
    {

        return rep.findById(id);
    }
    @PostMapping(path="/lender/createAccessToken/{id}")
    public void createAccessToken(@RequestBody Lender_Access_Token lend) {
//        Lender_Access_Token l = lend;
//        Lender ll = lend.getLender();
//        l.setLender(ll);
        rep.save(lend);


//        Optional<Lender_Access_Token> newll= rep.findById(lender.getId());
//        Lender_Access_Token ll = newll.get();
//        rep.save(ll);
    }
    @DeleteMapping(path = "/lender/deleteAccessToken/{id}")
    public void deleteAccessToken(@PathVariable int id)
    {

        rep.deleteById(id);
    }


}
