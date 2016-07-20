package api;

import model.Symbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by facundov on 19/07/16.
 */

@EnableAutoConfiguration
@ComponentScan("api.restcontrollers")
@EnableJpaRepositories(basePackages = {"repositories"})
@EntityScan(basePackageClasses= Symbol.class)
public class App {
    @Autowired
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }


}
