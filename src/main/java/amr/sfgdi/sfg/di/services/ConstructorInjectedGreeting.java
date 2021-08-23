package amr.sfgdi.sfg.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class ConstructorInjectedGreeting implements Greeting {
    @Override
    public String sayHello() {
        return "hello ya wla--- Constructor";
    }
}
