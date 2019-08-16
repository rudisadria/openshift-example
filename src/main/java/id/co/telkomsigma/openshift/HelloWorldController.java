package id.co.telkomsigma.openshift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${name}")
	private String name = "";
	
	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World "+name;
	}
	
	@RequestMapping("/hello")
	public String helloWorld2() {
		return "Hello World";
	}
}
