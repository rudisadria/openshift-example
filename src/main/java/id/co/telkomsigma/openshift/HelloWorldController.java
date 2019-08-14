package id.co.telkomsigma.openshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World";
	}
	
	@RequestMapping("/hello")
	public String helloWorld2() {
		return "Hello World";
	}
}
