package com.example.demo;

import org.springframework.stereotype.Component;


public class ErrorResponse {
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ErrorResponse(String number, boolean error) {
        this.number = number;
        this.error = error;
    }

    String number;
    boolean error;
}
