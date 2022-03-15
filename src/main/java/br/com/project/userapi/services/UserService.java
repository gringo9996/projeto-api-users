package br.com.project.userapi.services;

import java.util.List;

import br.com.project.userapi.domain.User;

public interface UserService {
	
	User findById(Long id);
	
	List<User>findAll();

}
