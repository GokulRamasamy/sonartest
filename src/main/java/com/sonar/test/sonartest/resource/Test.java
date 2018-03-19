package com.sonar.test.sonartest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping(value="/api/test")
    public ResponseEntity<String> capitalize(@RequestParam("param1") String text){

        String capital = "Welcome to "+text.toUpperCase();
        System.out.println(capital);
        return ResponseEntity.ok(capital);

    }
}
