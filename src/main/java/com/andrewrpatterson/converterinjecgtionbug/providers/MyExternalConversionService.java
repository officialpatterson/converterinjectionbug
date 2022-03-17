package com.andrewrpatterson.converterinjecgtionbug.providers;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class MyExternalConversionService {

    private final ConversionService conversionService;

    public MyExternalConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    public int transformid(int id) {
        return id * id;
    }
}
