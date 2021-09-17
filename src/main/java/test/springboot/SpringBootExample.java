package test.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;  
  
@EnableAutoConfiguration
@RestController
@SpringBootApplication  
public class SpringBootExample {  
    public static void main(String[] args) {  
        SpringApplication.run(SpringBootExample.class, args);  
    }  
}  