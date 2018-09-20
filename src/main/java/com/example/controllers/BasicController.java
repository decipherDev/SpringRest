package com.example.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
public class BasicController {

	@Getter
	@Setter
	public static class Demo {
		private Map<String,String> string;
		private String name;
		private int id;
	}
	
	@RequestMapping(value="/pathVarable/{sayWhat}", method=RequestMethod.PUT)
	String sayHello(@PathVariable("sayWhat") String say) {
		return say;
	}
	
	@RequestMapping(value="/queryParam", method=RequestMethod.PUT)
	String queryResolver(@RequestParam(value="query", required=false) String query) {
		return "Your "+query+" will be resolved";
	}
	
	@RequestMapping(value="/parse", method=RequestMethod.POST) 
	Demo respondDemo(@RequestBody Demo demo) {
		return demo;
	}
}
