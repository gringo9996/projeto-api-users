package br.com.project.userapi.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.project.userapi.domain.User;
import br.com.project.userapi.repository.UserRepository;
import br.com.project.userapi.services.UserService;
import br.com.project.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class UserServiceImp  implements UserService{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		
		
		return userRepository.findById(id)
				.orElseThrow(()->new ObjectNotFoundException("Usuário não encontrado"));
	}

	@Override
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

}
