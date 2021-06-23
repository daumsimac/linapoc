package com.lina.controller.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lina.controller.dao.MemberDao;
import com.lina.model.vo.Member;

@Repository
public class MemberDaoImpl  extends BaseDaoBean implements MemberDao {

	@Override
	public List<Member> listMembers() {
		return getSqlSession().selectList("Member.selectAllMember") ;
	}
	
	

}
