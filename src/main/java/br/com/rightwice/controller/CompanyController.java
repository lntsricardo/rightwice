package br.com.rightwice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rightwice.model.entity.User;
import br.com.rightwice.service.UserService;

@RestController
@RequestMapping(value="/user")
public class CompanyController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(path="/save")
	@ResponseBody
	public String save(@Valid User user, BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return "Name can't be null!";
		}
		return service.save(user);
	}
	
	@RequestMapping(path="/find")
	@ResponseBody
	public List<User> findByName(String name) throws Exception{
		return service.findByName(name);
	}
	
	@RequestMapping(path="/findAll")
	@ResponseBody
	public Iterable<User> findAll() throws Exception{
		return service.findAll();
	}
	
	@RequestMapping(path="/delete")
	@ResponseBody
	public void delete(Long id) throws Exception{
		service.delete(id);
	}

}
