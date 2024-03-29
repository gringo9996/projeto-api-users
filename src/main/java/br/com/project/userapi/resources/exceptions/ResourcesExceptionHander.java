package br.com.project.userapi.resources.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.project.userapi.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourcesExceptionHander {
	
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound( ObjectNotFoundException exception, HttpServletRequest request){
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(new StandardError(LocalDateTime.now()
						,exception.getMessage(),
						HttpStatus.NOT_FOUND.value()
						,request.getRequestURI()));
		
	}

}
