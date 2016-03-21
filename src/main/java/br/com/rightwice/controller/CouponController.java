package br.com.rightwice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.Coupon;
import br.com.rightwice.service.CouponService;

@RestController
@RequestMapping(value="/coupon")
public class CouponController {
	
	@Autowired
	private CouponService service;
	
	@RequestMapping(path="/save")
	@ResponseBody
	public String save(@Valid Coupon coupon, BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return "Name can't be null!";
		}
		return service.save(coupon);
	}
	
	@RequestMapping(path="/findByCompany")
	@ResponseBody
	public List<Coupon> findByCompany(Company company) throws Exception {
		return service.findByCompany(company);
	}
	
	@RequestMapping(path="/findAll")
	@ResponseBody
	public Iterable<Coupon> findAll() throws Exception {
		return service.findAll();
	}
	
	@RequestMapping(path="/delete")
	@ResponseBody
	public void delete(Long id) throws Exception {
		service.delete(id);
	}

}
