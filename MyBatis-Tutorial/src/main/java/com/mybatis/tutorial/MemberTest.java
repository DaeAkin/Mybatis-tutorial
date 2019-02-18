package com.mybatis.tutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "test-context.xml")
public class MemberTest {

	@Autowired
	MemberDao memberDao;

//	@Test
//	public void insertTest() {
//		MemberDto memberDto = new MemberDto("test", "1234");
//		memberDao.insertMember(memberDto);
//	}
	
	@Test
	public void deleteTest() {
		memberDao.deleteMember(1);
	}
}
