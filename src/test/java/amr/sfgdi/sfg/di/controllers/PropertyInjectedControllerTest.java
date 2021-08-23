package amr.sfgdi.sfg.di.controllers;

import amr.sfgdi.sfg.di.services.PropertyInjectedGreeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController = new PropertyInjectedController();

    @BeforeEach
    void setUp() {
        propertyInjectedController.greeting = new PropertyInjectedGreeting();
    }

    @Test
    void show() {
        System.out.println(propertyInjectedController.show());
    }
}