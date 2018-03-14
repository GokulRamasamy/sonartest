package com.sonar.test.sonartest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value="/api/test")
    public ResponseEntity<String> capitalize(@RequestParam("param1") String text){

        String capital = "Welcome to "+text.toUpperCase();
        return ResponseEntity.ok(capital);

    }
}
