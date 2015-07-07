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
	        //�����������
	        user.setId(1);
	        user.setUsername("Jessica1");
	        user.setPassword("123");
	        userDao.addUser(user);
	        user.setId(2);
	        user.setUsername("Jessica2");
	        user.setPassword("123");
	        userDao.addUser(user);
	        System.out.println("��ӳɹ�");
	        //��ѯ����
	        user.setUsername("Jessica");
	        user.setPassword("123");
	        System.out.println(userDao.getUser(user).toString());
	        user.setUsername("Jessica2");
	        user.setPassword("123");
	        System.out.println(userDao.getUser(user).toString());
	        //�޸�����
	        user.setId(2);
	        user.setPassword("802");
	        userDao.updateUser(user);
	        System.out.println("�޸ĳɹ�");
	        //ɾ������
	        userDao.deleteUser(1);
	        System.out.println("ɾ���ɹ�");
		
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
		
	}
	
	
	
}
