package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberResponse {
    private Object number;
    private Boolean is_prime;
    private Boolean is_perfect;
    private List<String> properties;
    private Integer digit_sum;
    private String fun_fact;


    public NumberResponse(int number, boolean is_prime, boolean is_perfect, List<String> properties, int digit_sum, String fun_fact) {
        this.number = number;
        this.is_prime = is_prime;
        this.is_perfect = is_perfect;
        this.properties = properties;
        this.digit_sum = digit_sum;
        this.fun_fact = fun_fact;
    }


    public Object getNumber() {
        return number;
    }

    public void setNumber(Object number) {
        this.number = number;
    }

    public Boolean getIs_prime() {
        return is_prime;
    }

    public void setIs_prime(Boolean is_prime) {
        this.is_prime = is_prime;
    }

    public Boolean getIs_perfect() {
        return is_perfect;
    }

    public void setIs_perfect(Boolean is_perfect) {
        this.is_perfect = is_perfect;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public Integer getDigit_sum() {
        return digit_sum;
    }

    public void setDigit_sum(Integer digit_sum) {
        this.digit_sum = digit_sum;
    }

    public String getFun_fact() {
        return fun_fact;
    }

    public void setFun_fact(String fun_fact) {
        this.fun_fact = fun_fact;
    }

}