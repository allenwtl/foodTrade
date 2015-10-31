package org.foodTrade.server.common.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.foodTrade.server.common.domain.User;
import org.foodTrade.server.common.util.ViewObjectValueUtil;

public class MybatisTest {
	
	private final static String FILEPATH = "server-mybatis/mybatis-config.xml";
	
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		SqlSessionFactory sqlSessionFactory ;
		SqlSession sqlSession = null ;
		
		try {
			InputStream  inputStream = Resources.getResourceAsStream(FILEPATH);
			
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			sqlSession = sqlSessionFactory.openSession();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id",1);
			User user = sqlSession.selectOne("UserMapper.queryUser", map);
			ViewObjectValueUtil.viewClass(User.class, user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		
	}

}
