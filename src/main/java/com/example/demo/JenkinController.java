package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {

	
	  @GetMapping("/")
	    public String home() {
	        return "Hello from Jenkins → Docker → Kubernetes+automation process ";
	    }
	  
	  
	  @GetMapping("/checking")
	    public String method() {
	        return "added new one ";
	    }
}
