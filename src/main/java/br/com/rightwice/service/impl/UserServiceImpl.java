package br.com.rightwice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rightwice.model.dao.UserDao;
import br.com.rightwice.model.entity.User;
import br.com.rightwice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	public String save(User user) throws Exception {
		User userCreated = dao.save(user);
		return String.format("Person %s created successfully", userCreated.getName());
	}

	@Override
	public List<User> findByName(String name) throws Exception {
		return dao.findByName(name);
	}

	@Override
	public Iterable<User> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public void delete(Long id) throws Exception {
		dao.delete(id);
	}

}
