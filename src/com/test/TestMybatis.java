package com.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.entity.User;
import com.service.IUserService;

//@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMybatis {  
    private static Logger logger = Logger.getLogger(TestMybatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        System.out.println(user);
        //System.out.println(user.getUserName());  
        //logger.info("ֵ��"+user.getUserName());  
    }  
}
