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
	        System.out.println("the controoler class from configmap 1 & 2->"+conf.getMessage());
	        return conf.getMessage();
	    }
	  @GetMapping("/message")
	    public String sampleMessage() {
	        System.out.println("the controoler class config map 2->"+conf.getSamplemessage());
	        return conf.getSamplemessage();
	    }
	  
	  @GetMapping("/message1")
	    public String sampleMessage1() {
	        System.out.println("the controoler class message 1 config map 1->"+conf.getMessage1());
	        return conf.getMessage1();
	    }

}
