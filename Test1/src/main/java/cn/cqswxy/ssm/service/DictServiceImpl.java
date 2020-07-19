package cn.cqswxy.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cqswxy.ssm.entity.Dict;
import cn.cqswxy.ssm.mapper.DictMapper;
@Service
public class DictServiceImpl implements DictService{
	@Autowired
	private DictMapper dictMapper;
	@Override
	public List<Dict> getList(String code) {
		// TODO Auto-generated method stub
		return dictMapper.selectByTypeName(code);
	}
	
	
}
