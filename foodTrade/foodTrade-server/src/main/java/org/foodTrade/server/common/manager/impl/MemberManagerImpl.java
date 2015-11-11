package org.foodTrade.server.common.manager.impl;

import javax.annotation.Resource;

import org.foodTrade.server.common.dao.GenericDao;
import org.foodTrade.server.common.domain.Member;
import org.foodTrade.server.common.manager.MemberManager;
import org.foodTrade.server.common.util.JSONUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MemberManagerImpl implements MemberManager {

	private static final Logger logger = LoggerFactory.getLogger(MemberManagerImpl.class);
	
	@Resource(name="dao")
	private GenericDao dao ;
	
	@Override
	public int addMember(Member member) {
		return dao.insertAndReturnAffectedCount("MemberMapper.insert", member);
	}

	@Override
	public int updateMember(Member member) {
		return dao.update("MemberMapper.update", JSONUtils.object2MapSpecail(member));
	}

	@Override
	public Member queryMemberById(long id) {
		return dao.queryUnique("MemberMapper.selectOne", id);
	}

}
