package com.study.springbootstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/products")
    public String getProduct(@RequestParam int minPrice,
    						@RequestParam int maxPrice) {
    	return "minPrice = "+minPrice+"\n"
    			+"maxPrice="+maxPrice;
    }
}