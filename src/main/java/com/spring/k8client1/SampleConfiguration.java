package com.spring.k8client1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
public class SampleConfiguration {
	
	    @Value("${message:property from spring boot local}")
	    private String message;
	    
	    @Value("${samplemessage:property from spring boot local sample message}")
	    private String samplemessage;


	    public String getMessage() {
	        return message;
	    }

	    public String getSamplemessage() {
			return samplemessage;
		}

		public void setSamplemessage(String samplemessage) {
			System.out.println("the message from configuration class sample message:"+samplemessage);
			this.samplemessage = samplemessage;
		}

		public void setMessage(String message) {
	    	System.out.println("the message from configuration class:"+message);
	        this.message = message;
	    }
	}
	
