package br.com.rightwice.service;

import java.util.List;

import br.com.rightwice.model.entity.User;

public interface UserService {

	String save(User user) throws Exception;
	
	List<User> findByName(String name) throws Exception;

	Iterable<User> findAll() throws Exception;
	
	void delete(Long id) throws Exception;

}
