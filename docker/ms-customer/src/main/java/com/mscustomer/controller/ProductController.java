package com.mscustomer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/customer")
public class ProductController {

    @GetMapping()
    public String getMessage() {
        log.info("Access customer controller!");

        return "Hello Customer";
    }
}
