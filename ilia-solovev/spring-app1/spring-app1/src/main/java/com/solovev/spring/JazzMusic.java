package com.solovev.spring;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    @Override
    public String getSong() {
        return "Somewhere over the rainbow";
    }
}
