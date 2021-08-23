package amr.sfgdi.sfg.di.controllers;

import amr.sfgdi.sfg.di.services.ConstructorInjectedGreeting;
import amr.sfgdi.sfg.di.services.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    final private Greeting greeting;
    ConstructorInjectedController(@Qualifier("constructorInjectedGreeting") Greeting greeting){
        this.greeting = greeting;
    }
    public String show(){
        return greeting.sayHello();
    }
}
