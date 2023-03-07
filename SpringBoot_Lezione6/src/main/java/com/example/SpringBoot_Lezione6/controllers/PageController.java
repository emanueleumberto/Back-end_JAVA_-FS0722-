package com.example.SpringBoot_Lezione6.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class PageController {
	
	@GetMapping("/homepage")
	public @ResponseBody String getHomePage() {
		return "Prima pagina Spring Web MVC";
	}
	
	@GetMapping("/contact")
	public @ResponseBody String getContactPage() {
		return "Messaggio inviato!!!";
	}
	
	@GetMapping("/test")
	public @ResponseBody String getTestParams1(
				@RequestParam String name, 
				@RequestParam String lastname,
				@RequestParam(required = false) String age
			) {
		//http://localhost:8080/api/test?name=Mario&lastname=Rossi
		if(age != null) {
			return "Test parameter: " + name + " " + lastname + " age: " +age;
		}
		return "Test parameter: " + name + " " + lastname;
	}
	
	@GetMapping("/test2/{name}/{lastname}")
	public @ResponseBody String getTestParams2(
				@PathVariable String name, 
				@PathVariable String lastname) {
		//http://localhost:8080/api/test2/Mario/Rossi

		return "Test parameter: " + name + " " + lastname;
	}
	
	@GetMapping("/test3/{name}/{lastname}")
	public String getTestThymeleaf(
				Map<String, Object> model,
				@PathVariable String name,
				@PathVariable String lastname) {
		model.put("testName", name);
		model.put("testLastname", lastname);
		return "test";
	}
	
	@GetMapping("/test4/{name}/{lastname}")
	public String getTestThymeleaf(
				Model model,
				@PathVariable String name,
				@PathVariable String lastname
			) {
		model.addAttribute("testName", name);
		model.addAttribute("testLastname", lastname);
		return "test";
	}
	
	@GetMapping("/test5/{name}/{lastname}")
	public ModelAndView getTestThymeleaf(
				@PathVariable String name,
				@PathVariable String lastname
			) {
		ModelAndView model = new ModelAndView("test");
		model.addObject("testName", name);
		model.addObject("testLastname", lastname);
		return model;
	}
}
