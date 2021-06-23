package com.lina.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lina.controller.dao.MemberDao;
import com.lina.model.vo.Member;

@Repository
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao ; 

	@Override
	public List<Member> listMembers() {
		return memberDao.listMembers() ;
	}

}
