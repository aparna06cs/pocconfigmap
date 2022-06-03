package com.spring.k8client1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
public class SampleConfiguration {
	
	    private String message = "hello how r u";

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	    	System.out.println("the message from configuration class:"+message);
	        this.message = message;
	    }
	}
	
