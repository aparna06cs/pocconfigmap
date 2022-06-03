package com.spring.k8client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class SampleController {
	
	@Autowired 
	private SampleConfiguration conf;
	
	 @Value("${message:testing kubectl}")
	    private String message;
	 
	  @GetMapping
	    public String welcome() {
	        System.out.println(message);
	        System.out.println("the controoler class->"+conf.getMessage());
	        return message;
	    }

}
