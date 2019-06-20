package com.mybatis.tutorial;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDao {

	@Autowired
	SqlSession sqlSession;
	
	public int insertMember(MemberDto memberDto) {
		return sqlSession.insert("memberInsert", memberDto);
	}
	
	public int deleteMember(int no) {
		System.out.println("---- deleteMember() ----");
		return sqlSession.delete("deleteMember", no);
	}
}
