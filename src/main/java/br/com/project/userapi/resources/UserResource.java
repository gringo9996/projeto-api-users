package br.com.project.userapi.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.project.userapi.domain.User;

public interface UserResource {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<User>findById(@PathVariable Long id);
	
	
	@GetMapping
	ResponseEntity<List<User>>findAll();

}
