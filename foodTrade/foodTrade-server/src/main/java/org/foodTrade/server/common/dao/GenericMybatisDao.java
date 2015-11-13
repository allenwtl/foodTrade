package org.foodTrade.server.common.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.foodTrade.server.common.util.DataPage;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component(value="dao")
public class GenericMybatisDao implements GenericDao {

	@Resource(name = "sqlSessionTemplate")
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
	public <T> T queryUnique(String sqlNameWithNameSpace, long id) {
		return mybatisTemplate.selectOne(sqlNameWithNameSpace, id);
	}

	@Override
	public <T> T queryUnique(String sqlNameWithNameSpace, String uniqueColumn) {
		return mybatisTemplate.selectOne(sqlNameWithNameSpace, uniqueColumn);
	}

	@Override
	public <T> List<T> queryList(String sqlNameWithNameSpace, Map<String, Object> map) {
		return mybatisTemplate.selectList(sqlNameWithNameSpace, map);
	}

	@Override
	public int queryCount(String sqlNameWithNameSpace, Map<String, Object> map) {
		return mybatisTemplate.<Integer> selectOne(sqlNameWithNameSpace, map);
	}

	@Override
	public <T> DataPage<T> queryListPage(String countSqlNameWithNameSpace, String sqlNameWithNameSpace, Map<String, Object> map,
			DataPage<T> dataPage) {
		map.put("startIndex", (dataPage.getPageNo()-1) * dataPage.getPageSize());
		map.put("pageSize", dataPage.getPageSize());
		
		if (dataPage.isNeedTotalCount()) {
			dataPage.setTotalCount(queryCount(countSqlNameWithNameSpace, map));
		}

		if (dataPage.isNeedData()) {
			if (dataPage.isNeedTotalCount()) {
				if (dataPage.getTotalCount() > 0) {
					dataPage.setDataList(queryList(sqlNameWithNameSpace, map));
				} else {
					dataPage.setDataList(new ArrayList<>());
				}
			} else {
				dataPage.setDataList(queryList(sqlNameWithNameSpace, map));
			}
		}
		return dataPage;
	}

}
