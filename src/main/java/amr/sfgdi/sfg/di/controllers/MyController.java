package amr.sfgdi.sfg.di.controllers;

import amr.sfgdi.sfg.di.services.Greeting;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final Greeting greeting;
    MyController(Greeting greeting){
        this.greeting = greeting;
    }
    public String sayHello(){
        return this.greeting.sayHello()+" shoft el gmal ya wla";
    }
}
