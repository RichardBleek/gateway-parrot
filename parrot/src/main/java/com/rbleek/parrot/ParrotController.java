package com.rbleek.parrot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParrotController {

    @GetMapping("/{input}")
    public String parrot(@PathVariable("input") String input) {
        return input + "... " + input;
    }
}
