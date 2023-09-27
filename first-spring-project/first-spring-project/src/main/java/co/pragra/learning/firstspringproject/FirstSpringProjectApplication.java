package co.pragra.learning.firstspringproject;

import co.pragra.learning.firstspringproject.conf.AppConfig;
import co.pragra.learning.firstspringproject.pojo.QuoteGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

//@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {

//		Path path = Paths.get("src", "main", "resources", "application-context.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext(path.toString());

//
//
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		QuoteGenerator generator = context.getBean("quoteGenerator", QuoteGenerator.class);
		generator.printQuote();

		((ConfigurableApplicationContext) context).registerShutdownHook();
//		((FileSystemXmlApplicationContext) context).registerShutdownHook();
//		((AnnotationConfigApplicationContext) context).registerShutdownHook();




	}

}
