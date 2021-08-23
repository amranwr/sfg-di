package amr.sfgdi.sfg.di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"english","default"})
@Service("language")
public class English implements Greeting{

    @Override
    public String sayHello() {
        return "English everywhere ";
    }
}
