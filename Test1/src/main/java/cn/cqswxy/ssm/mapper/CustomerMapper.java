package cn.cqswxy.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.cqswxy.ssm.entity.Customer;
@Repository
public interface CustomerMapper {

	List<Customer> selectAll(Customer customer);
	
	Integer deleteOne(Integer[] id);
	
	Integer insertOne(Customer customer);
	
	Integer updateOne(Customer customer);
	
	Customer selectById(Integer custId);
} 
