package org.foodTrade.server.common.dao;

import java.util.Map;

public interface GenericDao {
	
	/**
	 * 插入数据并返回影响的行数
	 * @param sqlNameWithNameSpace
	 * @param obj
	 * @return
	 */
	public <T> int insertAndReturnAffectedCount(String sqlNameWithNameSpace, T obj);
	
	public int update(String sqlNameWithNameSpace, Map<String, Object> param);
	
	/**
	 * 通过ID字段查询唯一记录
	 * @param sqlNameWithNameSpace
	 * @param id
	 * @return
	 */
	public <T> T queryUnique(String sqlNameWithNameSpace, Long id);
	
	/**
	 * 通过唯一字段查询唯一记录
	 * @param sqlNameWithNameSpace
	 * @param uniqueColumn
	 * @return
	 */
    public <T> T queryUnique(String sqlNameWithNameSpace, String uniqueColumn);
	
    public <T> T queryUnique(String sqlNameWithNameSpace, Map<String, Object> map);
    
}
