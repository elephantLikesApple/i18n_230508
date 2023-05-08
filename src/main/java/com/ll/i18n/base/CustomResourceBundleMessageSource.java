package com.ll.i18n.base;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class CustomResourceBundleMessageSource extends ResourceBundleMessageSource {
    @Override
    protected  String resolveCodeWithoutArguments(String code, Locale locale) {
        System.out.println("code: " + code);
        return super.resolveCodeWithoutArguments(code, locale);
    }
}
