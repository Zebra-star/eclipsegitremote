package cn.cqswxy.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.cqswxy.ssm.entity.Dict;
@Repository
public interface DictMapper {

	List<Dict> selectByTypeName(String code);
	
	Dict selectResourceByItemCode(String dictItemCode);
}
