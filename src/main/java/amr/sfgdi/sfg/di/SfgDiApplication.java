package amr.sfgdi.sfg.di;

import amr.sfgdi.sfg.di.controllers.ConstructorInjectedController;
import amr.sfgdi.sfg.di.controllers.LanguageController;
import amr.sfgdi.sfg.di.controllers.MyController;
import amr.sfgdi.sfg.di.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();

		System.out.println(greeting);
		System.out.println("-------------");
		LanguageController languageController = (LanguageController) ctx.getBean("languageController");
		System.out.println(languageController.show());

		System.out.println("-------------");

		PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.show());

		System.out.println("--------------");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.show());
	}

}
