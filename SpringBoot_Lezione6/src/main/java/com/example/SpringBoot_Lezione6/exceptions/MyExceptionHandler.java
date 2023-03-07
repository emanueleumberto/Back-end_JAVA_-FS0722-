package com.example.SpringBoot_Lezione6.exceptions;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	
	
	 @ExceptionHandler(RuntimeException.class) public ResponseEntity<String>
	  myHandlerRuntimeException(RuntimeException e) { return new
	  ResponseEntity<String>("Errore!!!", HttpStatus.NOT_FOUND); }
	 
	
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<String> myHandlerArithmeticException(ArithmeticException e) {
		return new ResponseEntity<String>("Errore!!!", HttpStatus.NOT_FOUND);
	}

}
