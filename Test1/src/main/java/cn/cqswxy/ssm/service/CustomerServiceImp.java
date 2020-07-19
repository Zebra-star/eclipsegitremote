package cn.cqswxy.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.cqswxy.ssm.entity.Customer;
import cn.cqswxy.ssm.mapper.CustomerMapper;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Customer> getList(Customer customer, Integer pageNum) {
		if (pageNum == null) {
			pageNum = 1;
		}
		PageHelper.startPage(pageNum,5);
		return customerMapper.selectAll(customer);
	}

	@Override
	public Integer modOne(Customer customer) {
		return customerMapper.updateOne(customer);
	}

	@Override
	public Integer addOne(Customer customer) {
		return customerMapper.insertOne(customer);
	}

	@Override
	public Integer delSome(Integer[] ids) {
		if (ids == null || ids.length ==0) {
			return -1;
		}
		return customerMapper.deleteOne(ids);
	}

	@Override
	public Customer selectById(Integer custId) {
		// TODO Auto-generated method stub
		return customerMapper.selectById(custId);
	}

}
