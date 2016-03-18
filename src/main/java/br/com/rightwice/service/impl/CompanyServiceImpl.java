package br.com.rightwice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rightwice.model.dao.CompanyDao;
import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.enumeration.CompanyType;
import br.com.rightwice.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyDao dao;

	@Override
	public String save(Company company) throws Exception {
		Company savedCompany = dao.save(company);
		return savedCompany.getName();
	}

	@Override
	public List<Company> findByName(String name) throws Exception {
		return dao.findByName(name);
	}

	@Override
	public List<Company> findByType(CompanyType type) throws Exception {
		return dao.findByType(type);
	}

	@Override
	public Iterable<Company> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public void delete(Long id) throws Exception {
		dao.delete(id);
	}

}
