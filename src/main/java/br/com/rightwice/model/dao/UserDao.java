package br.com.rightwice.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rightwice.model.entity.User;

public interface UserDao extends CrudRepository<User, Long>{
	
	public List<User> findByName(String name);

}
