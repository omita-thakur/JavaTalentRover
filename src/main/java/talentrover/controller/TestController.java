package talentrover.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TestController {	
    
    @RequestMapping("/")
    public String testMethod() {
    	return "whats up";
    }

}