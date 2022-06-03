package com.spring.k8client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class SampleController {
	
	@Autowired 
	private SampleConfiguration conf;
	
	  @GetMapping
	    public String welcome() {
	        System.out.println("the controoler class->"+conf.getMessage());
	        return conf.getMessage();
	    }

}
