package amr.sfgdi.sfg.di.controllers;

import amr.sfgdi.sfg.di.services.Greeting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class LanguageController {
    private final Greeting greeting;

    public LanguageController(@Qualifier("language") Greeting greeting){
        this.greeting = greeting;
    }

    public String show(){
        return this.greeting.sayHello();
    }
}
