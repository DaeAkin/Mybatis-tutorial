package com.mybatis.tutorial;

import static org.hamcrest.CoreMatchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "test-context.xml")
public class MemberTest {

	
//	@Autowired
//	MemberDao memberDao;
	
	MemberDao mockDao = mock(MemberDao.class);
	

//	@Test
//	public void insertTest() {
//		MemberDto memberDto = new MemberDto("test", "1234");
//		memberDao.insertMember(memberDto);
//	}
	
	@Test
	public void deleteTest() {
//		memberDao.deleteMember(1);
		mockDao.deleteMember(anyInt());
		mockDao.deleteMember(anyInt());
		
		verify(mockDao, times(2)).deleteMember(anyInt());
	}
}
