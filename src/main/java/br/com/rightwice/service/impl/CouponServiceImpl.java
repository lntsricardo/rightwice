package br.com.rightwice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rightwice.model.dao.CouponDao;
import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.Coupon;
import br.com.rightwice.model.entity.enumeration.CouponType;
import br.com.rightwice.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService{
	
	@Autowired
	private CouponDao dao;

	@Override
	public String save(Coupon Coupon) throws Exception {
		Coupon savedCoupon = dao.save(Coupon);
		return savedCoupon.getName();
	}

	@Override
	public List<Coupon> findByCompany(Company company) throws Exception {
		return dao.findByCompany(company);
	}

	@Override
	public List<Coupon> findByType(CouponType type) throws Exception {
		return dao.findByType(type);
	}

	@Override
	public Iterable<Coupon> findAll() throws Exception {
		return dao.findAll();
	}

	@Override
	public void delete(Long id) throws Exception {
		dao.delete(id);
	}

}
