package com.andrewrpatterson.converterinjecgtionbug.legacy;

import com.andrewrpatterson.converterinjecgtionbug.entity.MyNewClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    final SimpleComponent simpleComponent;

    public Endpoint(SimpleComponent simpleComponent) {
        this.simpleComponent = simpleComponent;
    }

    @GetMapping("/bug")
    String bug() {
        MyNewClass s = simpleComponent.doThis();
        return s.getId() + "\t" + s.getName();
    }
}
