package br.com.rightwice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.enumeration.CompanyType;
import br.com.rightwice.service.CompanyService;

@RestController
@RequestMapping(value="/company")
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	@RequestMapping(path="/save")
	@ResponseBody
	public String save(@Valid Company company, BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return "Name can't be null!";
		}
		return service.save(company);
	}
	
	@RequestMapping(path="/find")
	@ResponseBody
	public List<Company> findByName(String name) throws Exception{
		return service.findByName(name);
	}
	
	@RequestMapping(path="/findType")
	@ResponseBody
	public List<Company> findByType(CompanyType type) throws Exception{
		return service.findByType(type);
	}
	
	@RequestMapping(path="/findAll")
	@ResponseBody
	public Iterable<Company> findAll() throws Exception{
		return service.findAll();
	}
	
	@RequestMapping(path="/delete")
	@ResponseBody
	public void delete(Long id) throws Exception{
		service.delete(id);
	}

}
