package br.com.project.userapi.resources.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.userapi.domain.User;
import br.com.project.userapi.resources.UserResource;
import br.com.project.userapi.services.UserService;


@RestController
@RequestMapping(value = "/api/users/")
public class UserResourceImp implements UserResource {
	
	
	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<User> findById(Long id) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body(userService.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> findAll() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body(userService.findAll());
	}

}
