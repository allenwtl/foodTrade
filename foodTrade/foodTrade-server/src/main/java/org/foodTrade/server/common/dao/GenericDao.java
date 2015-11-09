package org.foodTrade.server.common.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.foodTrade.server.common.util.DataPage;

public interface GenericDao {

	/**
	 * 插入数据并返回影响的行数
	 * 
	 * @param sqlNameWithNameSpace
	 * @param obj
	 * @return
	 */
	public <T> int insertAndReturnAffectedCount(String sqlNameWithNameSpace, T obj);

	/**
	 * 更新数据并返回影响的行数
	 * 
	 * @param sqlNameWithNameSpace
	 * @param obj
	 * @return
	 */
	public int update(String sqlNameWithNameSpace, Map<String, Object> param);

	/**
	 * 通过ID字段查询唯一记录
	 * 
	 * @param sqlNameWithNameSpace
	 * @param id
	 * @return
	 */
	public <T> T queryUnique(String sqlNameWithNameSpace, long id);

	/**
	 * 通过唯一字段查询唯一记录
	 * 
	 * @param sqlNameWithNameSpace
	 * @param uniqueColumn
	 * @return
	 */
	public <T> T queryUnique(String sqlNameWithNameSpace, String uniqueColumn);

	/**
	 * 通过多个字段查询唯一记录
	 * 
	 * @param sqlNameWithNameSpace
	 * @param map
	 * @return
	 */
	public <T> T queryUnique(String sqlNameWithNameSpace, Map<String, Object> map);

	/**
	 * 通过多个字段查询多条记录
	 * 
	 * @param sqlNameWithNameSpace
	 * @param map
	 * @return
	 */
	public <T> List<T> queryList(String sqlNameWithNameSpace, Map<String, Object> map);

	/**
	 * select count (*) from 根据条件统计
	 * 
	 * @param sqlNameWithNameSpace
	 * @param map
	 * @return
	 */
	public int queryCount(String sqlNameWithNameSpace, Map<String, Object> map);

	/**
	 * 通过多个字段分页查询
	 * 
	 * @param sqlNameWithNameSpace
	 * @param map
	 * @param dataPage
	 * @return
	 */
	public <T> DataPage<T> queryListPage(String countSqlNameWithNameSpace, String sqlNameWithNameSpace, Map<String, Object> map,
			DataPage<T> dataPage);
}
