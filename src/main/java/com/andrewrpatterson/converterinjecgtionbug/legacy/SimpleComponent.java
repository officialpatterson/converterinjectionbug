package com.andrewrpatterson.converterinjecgtionbug.legacy;

import com.andrewrpatterson.converterinjecgtionbug.entity.MyNewClass;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class SimpleComponent {

    ConversionService conversionService;

    public MyNewClass doThis() {
        MyOldClass old = new MyOldClass(1, "hello");

        return conversionService.convert(old, MyNewClass.class);
    }

    public SimpleComponent(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

}
