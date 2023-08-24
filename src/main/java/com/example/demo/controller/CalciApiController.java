rpackage com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciApiController {

     //server prod comment

    
	@GetMapping("/getTest")
	public String getTest() {
		return "running.........";
	}
	

	@GetMapping("/sub/{a}/{b}")
	public String sub(@PathVariable int a,@PathVariable int b) {
		return "sub is "+(a-b);
	}
	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a,@PathVariable int b) {
		return "add is "+(a+b);
	}

}
