package amr.sfgdi.sfg.di.controllers;

import amr.sfgdi.sfg.di.services.PropertyInjectedGreeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new PropertyInjectedGreeting());
    }

    @Test
    void show() {
        System.out.println(constructorInjectedController.show());
    }
}