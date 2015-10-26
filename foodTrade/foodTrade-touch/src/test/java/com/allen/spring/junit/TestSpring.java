package com.allen.spring.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring-config/spring-context.xml")
public class TestSpring {

	@Resource(name="age")
	private String age ;
	
	@Test
	public void test(){
		System.out.println(age);
		
	}
	
	
}
