package com.example.SpringBootOAuth2.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders/v1")
public class OAuth2Controller {

    // http://localhost:8080/orders/v1/hello
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello World");
    }

    //Secured
    // http://localhost:8080/orders/v1/securedHello
    @GetMapping(value = "/securedHello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> securedHello() {
        return ResponseEntity.ok("Hello World... Secured");
    }

}
