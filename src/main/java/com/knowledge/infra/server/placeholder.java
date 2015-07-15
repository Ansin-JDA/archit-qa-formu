package com.knowledge.infra.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;
import com.knowledge.infra.server.dao.QuestionDao;
import com.knowledge.infra.server.model.Question;

//����������ִ�������main����
//Command: mvn clean compile exec:java -Dexec.mainClass="com.knowledge.infra.server.placeholder"
//Added by Ansin Wang

public class placeholder {

	@SuppressWarnings("resource")
	public static void main(String[] arg){
		try{
	        ApplicationContext ctx=null;
	        ctx=new FileSystemXmlApplicationContext("src/main/resources/config/spring/ApplicationContext-dao.xml");	       
	        System.out.println("=================Main: Test User part begins!!!==================");
	        UserDao userDao=(UserDao) ctx.getBean("userDao");
	        User user=new User();
	        //�����������
	        user.setUname("Jessica1");
	        user.setUpassword("123");
	        user.setEmail("Jessica1@zwvalley.com");
	        user.setUdescription("testuser1");
	        userDao.addUser(user);
	        user.setUname("Jessica2");
	        user.setUpassword("123");
	        user.setEmail("Jessica2@zwvalley.com");
	        user.setUdescription("Jessica2");
	        userDao.addUser(user);
	        System.out.println("��Ӳ����û��ɹ�");
	        
	        //��ѯ����
	        //user.setUname("Jessica");
	        //user.setUpassword("123");
	        //System.out.println(userDao.getUser(user).toString());
	        //user.setUname("Jessica2");
	        //user.setUpassword("123");
	        //System.out.println(userDao.getUser(user).toString());
	        
	        //�޸�����
	        user.setUserid(2);
	        user.setUpassword("802");
	        userDao.updateUser(user);
	        System.out.println("�޸Ĳ����û��ɹ�");
	        //ɾ������
	        userDao.deleteUser(1);
	        userDao.deleteUser(2);	
	        System.out.println("ɾ�������û��ɹ�"); 
	        
	        
	        System.out.println("=================Main: Test Question part begins!!!==================");
	        QuestionDao questionDao=(QuestionDao) ctx.getBean("questionDao");
	        Question question=new Question();
	        //�����������
	        question.setQtitle("testQuestion1");
	        question.setQcontent("testContent1");
	        question.setQcreateuserid(1);
	        question.setQupdateuserid(1);
	        question.setQlabel("question 1");
	        questionDao.addQuestion(question);
	        question.setQtitle("testQuestion2");
	        question.setQcontent("testContent2");
	        question.setQcreateuserid(2);
	        question.setQupdateuserid(2);
	        question.setQlabel("question 2");
	        questionDao.addQuestion(question);
	        System.out.println("��Ӳ�������ɹ�");
		
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
	}
	
	
	
}
