package amr.sfgdi.sfg.di.controllers;

import amr.sfgdi.sfg.di.services.Greeting;
import amr.sfgdi.sfg.di.services.PropertyInjectedGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreeting")
    @Autowired
    public Greeting greeting ;
    public String show(){
        return greeting.sayHello();
    }
}
