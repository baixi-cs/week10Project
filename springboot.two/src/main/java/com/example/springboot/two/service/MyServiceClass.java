package com.example.springboot.two.service;

import org.springframework.stereotype.Service;

@Service  //for bean to be there available 
public class MyServiceClass {
	
	// Method
    // To compute factorial
    public int factorial(int n)
    {
        // Base case
        if (n == 0)
            return 1;
 
        return n * factorial(n - 1);
    }
    public String sayService() {
    	return "Service annotation";
    }

}
