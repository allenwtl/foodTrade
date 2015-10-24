package org.foodTrade.server.common.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component(value="dao")
public class GenericMybatisDao implements GenericDao {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate mybatisTemplate;
	
	
	@Override
	public <T> int insertAndReturnAffectedCount(String sqlNameWithNameSpace, T obj) {
		return mybatisTemplate.insert(sqlNameWithNameSpace, obj);
	}

	@Override
	public int update(String sqlNameWithNameSpace, Map<String, Object> param) {
		return mybatisTemplate.update(sqlNameWithNameSpace, param);
	}

	@Override
	public <T> T queryUnique(String sqlNameWithNameSpace, Map<String, Object> map) {
		return mybatisTemplate.<T> selectOne(sqlNameWithNameSpace, map);
	}

	@Override
	public <T> T queryUnique(String sqlNameWithNameSpace, Long id) {
		return mybatisTemplate.selectOne(sqlNameWithNameSpace, id);
	}

	@Override
	public <T> T queryUnique(String sqlNameWithNameSpace, String uniqueColumn) {
		return  mybatisTemplate.selectOne(sqlNameWithNameSpace, uniqueColumn);
	}

}
