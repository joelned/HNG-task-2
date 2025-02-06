package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NumberController {

    private final NumberService numberService;

    public NumberController(NumberService numberService) {
        this.numberService = numberService;
    }

    @GetMapping(value = "/classify-number" , produces = "application/json")
    public ResponseEntity<Object> classifyNumber(@RequestParam String number) {
        try {
            int num = Integer.parseInt(number);
            NumberResponse response = numberService.classifyNumber(num);

            return ResponseEntity.ok(response);
        } catch (NumberFormatException e) {
            return new ResponseEntity<>(new ErrorResponse("alphabet", true), HttpStatus.BAD_REQUEST);
        }
    }
}