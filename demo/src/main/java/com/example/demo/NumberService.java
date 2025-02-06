package com.example.demo;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberService {

    public NumberResponse classifyNumber(int number) {
        boolean isPrime = isPrime(number);
        boolean isPerfect = isPerfect(number);
        boolean isArmstrong = isArmstrong(number);
        boolean isOdd = number % 2 != 0;

        List<String> properties = new ArrayList<>();
        if (isArmstrong) properties.add("armstrong");
        properties.add(isOdd ? "odd" : "even");

        int digitSum = sumOfDigits(number);
        String fun_fact = getFunFact(number);

        return new NumberResponse(number, isPrime, isPerfect, properties, digitSum, fun_fact);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    private boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private String getFunFact(int num) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://numbersapi.com/" + num + "/math";
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            return "No fun fact available.";
        }
    }
}
