package br.com.project.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.userapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
