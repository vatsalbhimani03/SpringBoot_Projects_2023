package co.pragra.learning.firstspringproject.conf;

import co.pragra.learning.firstspringproject.pojo.QuoteGenerator;
import co.pragra.learning.firstspringproject.pojo.SimpleInsurance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


@PropertySource("./application.properties")
public class AppConfig {
    @Bean(initMethod = "initialization", destroyMethod = "destroy")
    public SimpleInsurance simpleInsurance(){
        return new SimpleInsurance();
    }


    public QuoteGenerator quoteGenerator(@Value("${name}") String name, @Value("${postalCode}") String postalCode){
        var quote = new QuoteGenerator(name, simpleInsurance());
        quote.setPostalCode(postalCode.substring(0,3));
        return quote;
    }
}
