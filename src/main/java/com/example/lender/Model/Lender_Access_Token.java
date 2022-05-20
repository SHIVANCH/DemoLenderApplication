package com.example.lender.Model;

import javax.persistence.*;

@Entity
@Table
public class Lender_Access_Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int token_id;
    private String lender_token;
    @ManyToOne
    private Lender lender;

    public Lender_Access_Token() {
    }

    public Lender_Access_Token(int token_id, String lender_token, Lender lender) {
        this.token_id = token_id;
        this.lender_token = lender_token;
        this.lender = lender;
    }

    public int getToken_id() {
        return token_id;
    }

    public void setToken_id(int token_id) {
        this.token_id = token_id;
    }

    public String getLender_token() {
        return lender_token;
    }

    public void setLender_token(String lender_token) {
        this.lender_token = lender_token;
    }

    public Lender getLender() {
        return lender;
    }

    public void setLender(Lender lender) {
        this.lender = lender;
    }

    @Override
    public String toString() {
        return "Lender_Access_Token{" +
                "token_id=" + token_id +
                ", lender_token='" + lender_token + '\'' +
                ", lender=" + lender +
                '}';
    }
}
