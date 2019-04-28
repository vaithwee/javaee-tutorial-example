package xyz.vaith.binding;


import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import xyz.vaith.converter.DateEditor;

import java.util.Date;

public class DateBindingInitializer implements WebBindingInitializer {
    @Override
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Date.class, new DateEditor());
    }
}
