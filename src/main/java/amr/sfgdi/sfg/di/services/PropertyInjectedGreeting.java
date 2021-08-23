package amr.sfgdi.sfg.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreeting implements Greeting {
    @Override
    public String sayHello() {
        return "hello ya wala---Property";
    }
}
