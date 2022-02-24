package com.fundamentos.fundamentos.component;

import org.springframework.stereotype.Component;
//Dependencia creada a partir de una interface
@Component
public class ComponentImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hello world from my components");
    }
}
