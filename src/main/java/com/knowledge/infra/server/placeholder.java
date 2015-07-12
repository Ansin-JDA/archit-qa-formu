package com.knowledge.infra.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;

public class placeholder {

	@SuppressWarnings("resource")
	public static void main(String[] arg){
		try{
	        ApplicationContext ctx=null;
	        ctx=new FileSystemXmlApplicationContext("src/main/resources/config/spring/ApplicationContext-dao.xml");
	        UserDao userDao=(UserDao) ctx.getBean("userDao");
	        User user=new User();
	        //添加两条数据
	        user.setUserid(1);
	        user.setUname("Jessica1");
	        user.setUpassword("123");
	        userDao.addUser(user);
	        user.setUserid(2);
	        user.setUname("Jessica2");
	        user.setUpassword("123");
	        userDao.addUser(user);
	        System.out.println("添加成功");
	        //查询数据
	        user.setUname("Jessica");
	        user.setUpassword("123");
	        System.out.println(userDao.getUser(user).toString());
	        user.setUname("Jessica2");
	        user.setUpassword("123");
	        System.out.println(userDao.getUser(user).toString());
	        //修改数据
	        user.setUserid(2);
	        user.setUpassword("802");
	        userDao.updateUser(user);
	        System.out.println("修改成功");
	        //删除数据
	        userDao.deleteUser(1);
	        System.out.println("删除成功");
		
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	
	
}
