package cn.cqswxy.ssm.service;

import java.util.List;

import cn.cqswxy.ssm.entity.Dict;

public interface DictService {

	List<Dict> getList(String code);
	
}
