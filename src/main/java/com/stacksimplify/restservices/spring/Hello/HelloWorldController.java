package com.stacksimplify.restservices.spring.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {

	//Simple Method
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld")
	public String helloWorld(){
		return "Hello World from Patrick";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean(){
		return new UserDetails("Patrick", "Alexander", "Oslo");
	}
}
