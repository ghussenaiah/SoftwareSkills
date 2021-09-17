package test.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAppController {     
	
    @RequestMapping("/app/world")
    public String helloMsg() {
    	System.out.println("Hello am calling ");
    	String msg = "Hello World!";
        return msg;
    }
} 
