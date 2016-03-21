package br.com.rightwice.service;

import java.util.List;

import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.Coupon;
import br.com.rightwice.model.entity.enumeration.CouponType;

public interface CouponService {
	
	String save(Coupon Coupon) throws Exception;
	
	List<Coupon> findByCompany(Company company) throws Exception;
	
	List<Coupon> findByType(CouponType type) throws Exception;

	Iterable<Coupon> findAll() throws Exception;
	
	void delete(Long id) throws Exception;

}
