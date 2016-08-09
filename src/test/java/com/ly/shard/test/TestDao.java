package com.ly.shard.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ly.shard.ibatis.dao.TbPassportDAO;
import com.ly.shard.ibatis.model.TbPassport;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class TestDao {
	
	@Autowired
	private TbPassportDAO tbPasswordDAO;
	
	@Test
	public void test(){
		long uid=1;
		TbPassport record=new TbPassport();
		record.setUid(uid);
		record.setEmail("123@126.com");
		record.setAccount("123");
		record.setmPhone("123");
		record.setPassword("123");
		record.setActived(false);
		record.setCreateTime(new Date());
		record.setIsRobot(false);
		record.setIsVerified(false);
		record.setIsBlacklisted(false);
		record.setIsDeleted(false);
		record.setUserType(0);
		
		tbPasswordDAO.insert(record);
	}
		

}
