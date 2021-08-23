package amr.sfgdi.sfg.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("spain")
@Service("language")
public class Spain  implements Greeting {
    @Override
    public String sayHello() {
        return "spain everywhere ";
    }
}
