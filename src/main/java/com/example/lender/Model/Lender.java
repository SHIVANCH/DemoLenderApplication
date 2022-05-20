package com.example.lender.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table
public class Lender implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Lender() {
    }

    public Lender(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lender{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



//    public Lender_Access_Token getToken() {
//        return token;
//    }
//
//    public void setToken(Lender_Access_Token token) {
//        this.token= token;
//    }
//
//    public Lender() {
//    }
//
//    public Lender(int id, String name) {
//        this.id = id;


    }
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Lender{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }

