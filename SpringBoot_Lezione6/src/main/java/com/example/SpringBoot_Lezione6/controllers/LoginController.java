package com.example.SpringBoot_Lezione6.controllers;





import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot_Lezione6.models.User;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView showFormLogin() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}
	
	@PostMapping("/userlog")
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView testLogin( User user ) {
		ModelAndView model = new ModelAndView("home");
		model.addObject("name", user.getName());
		model.addObject("email", user.getEmail());
		return model;
	}

	@GetMapping("/test")
	public void test() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Author", "Emanuele Umberto");
//		try {
//			throw new RuntimeException("Errore!!!");
//			
//		} catch (RuntimeException e) {
//			System.out.println("Errore!!!");
//			return new ResponseEntity<String>("Errore!!!", headers, HttpStatus.NOT_FOUND);
//		}
		throw new RuntimeException("Errore!!!");
		//return new ResponseEntity<String>("Pagina di test", headers, HttpStatus.OK);
		
	}
	
	
	
}
