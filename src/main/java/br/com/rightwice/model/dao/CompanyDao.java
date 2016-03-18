package br.com.rightwice.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.enumeration.CompanyType;

public interface CompanyDao extends CrudRepository<Company, Long>{
	
	public List<Company> findByName(String name);
	
	public List<Company> findByType(CompanyType type);
	

}
