package com.andrewrpatterson.converterinjecgtionbug.legacy;

import com.andrewrpatterson.converterinjecgtionbug.entity.MyNewClass;
import com.andrewrpatterson.converterinjecgtionbug.providers.MyExternalConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MyOldClassToMyNewClassConverter  implements Converter<MyOldClass, MyNewClass> {

    final MyExternalConversionService myExternalConversionService;

    public MyOldClassToMyNewClassConverter(MyExternalConversionService myExternalConversionService) {
        this.myExternalConversionService = myExternalConversionService;
    }

    @Override
    public MyNewClass convert(MyOldClass source) {
        return new MyNewClass(source.getId() + 1, source.getName());
    }
}
