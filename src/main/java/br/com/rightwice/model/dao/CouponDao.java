package br.com.rightwice.model.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.rightwice.model.entity.Company;
import br.com.rightwice.model.entity.Coupon;
import br.com.rightwice.model.entity.enumeration.CouponType;

public interface CouponDao extends CrudRepository<Coupon, Long>{

	List<Coupon> findByType(CouponType type) throws Exception;

	List<Coupon> findByCompany(Company company) throws Exception;

}
