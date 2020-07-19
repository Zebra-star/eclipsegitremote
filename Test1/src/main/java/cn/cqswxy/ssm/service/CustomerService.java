package cn.cqswxy.ssm.service;

import java.util.List;

import cn.cqswxy.ssm.entity.Customer;

public interface CustomerService {

	List<Customer> getList(Customer customer,Integer pageNum);
	
	Integer modOne(Customer customer);
	
	Integer addOne(Customer customer);
	
	Integer delSome(Integer[] ids);
	
	Customer selectById(Integer custId);
}
