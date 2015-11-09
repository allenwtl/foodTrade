package org.foodTrade.server.common.manager;

import org.foodTrade.server.common.domain.Member;

public interface MemberManager {
	
	int addMember(Member member);
	
	int updateMember(Member member);
	
	Member queryMemberById(long id);
}
