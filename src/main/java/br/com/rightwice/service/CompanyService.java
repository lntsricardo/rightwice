package br.com.rightwice.service;

import java.util.List;

import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.enumeration.CompanyType;

public interface CompanyService {
	
	String save(Company company) throws Exception;
	
	List<Company> findByName(String name) throws Exception;
	
	List<Company> findByType(CompanyType type) throws Exception;

	Iterable<Company> findAll() throws Exception;
	
	void delete(Long id) throws Exception;


}
