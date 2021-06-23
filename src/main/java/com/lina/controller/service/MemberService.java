package com.lina.controller.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lina.model.vo.Member;

@Service
public interface MemberService {
	
	List<Member> listMembers() ; 

}
