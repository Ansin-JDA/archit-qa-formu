package com.knowledge.infra.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;
import com.knowledge.infra.server.dao.QuestionDao;
import com.knowledge.infra.server.model.Question;
import com.knowledge.infra.server.dao.AnswerDao;
import com.knowledge.infra.server.model.Answer;
import com.knowledge.infra.server.dao.ManagerDao;
import com.knowledge.infra.server.model.Manager;


//两步命令来执行这儿的main函数
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
	        //添加两条数据
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
	        System.out.println("添加测试用户成功");
	        
	        //查询数据
	        user.setUname("Jessica1");
	        user.setUdescription("testuser1");
	        Map<String, Object> condition = new HashMap<String, Object>(2);
	        condition.put("uname", user.getUname());
	        condition.put("udescription", user.getUdescription());
	        for (int i=0; i < userDao.getUsers(condition).size(); i++){
	        	System.out.println(userDao.getUsers(condition).get(i));
	        }	        
	        System.out.println("===========查询测试用户成功==========");
	        
	        //修改数据
	        user.setUserid(2);
	        user.setUpassword("802");
	        userDao.updateUser(user);
	        System.out.println("修改测试用户成功");
	        //删除数据
	        userDao.deleteUser(1);
	        userDao.deleteUser(2);	
	        System.out.println("删除测试用户成功"); 
	        
	        
	        System.out.println("=================Main: Test Question part begins!!!==================");
	        QuestionDao questionDao=(QuestionDao) ctx.getBean("questionDao");
	        Question question=new Question();
	        //添加两条数据
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
	        System.out.println("添加测试问题成功");
	        
	        //查询数据 TODO
	        
	        //修改数据
	        question.setQuestionid(2);
	        question.setQtitle("Title After updating - 2");
	        questionDao.updateQuestion(question);
	        System.out.println("修改测试问题成功");
	        //删除数据
	        questionDao.deleteQuestion(1);
	        questionDao.deleteQuestion(2);
	        System.out.println("测除测试问题成功");
	        
	        
	        System.out.println("=================Main: Test Answer part begins!!!==================");
	        AnswerDao answerDao=(AnswerDao) ctx.getBean("answerDao");
		    Answer answer=new Answer();
		    //添加两条数据
		    answer.setAreferenceqid(1);
		    answer.setAtitle("testAnswer 1");
		    answer.setAcontent("testContent 1");
		    answer.setAcreateuserid(5);
		    answer.setAupdateuserid(6);
		    answerDao.addAnswer(answer);
		    answer.setAreferenceqid(2);
		    answer.setAtitle("testAnswer 2");
		    answer.setAcontent("testContent 2");
		    answer.setAcreateuserid(7);
		    answer.setAupdateuserid(8);
		    answerDao.addAnswer(answer);
		    System.out.println("添加测试回答成功");
		    
		    //查询数据   TODO
		    
		    //修改数据 (暂时还没有关于goodnum和badnum的更改！)
		    answer.setAnswerid(2);
		    answer.setAtitle("Title after updating - 2");
		    answer.setAcontent("Content after updating - 2");
		    answerDao.updateAnswer(answer);
		    System.out.println("修改测试回答成功");
		    
		    //删除数据
		    answerDao.deleteAnswer(1);
		    answerDao.deleteAnswer(2);
		    System.out.println("测除测试数据成功");
		    
		    
		    System.out.println("=================Main: Test Manager part begins!!!==================");
		    ManagerDao managerDao=(ManagerDao) ctx.getBean("managerDao");
		    Manager manager=new Manager();
		    //添加两条数据
		    manager.setMname("test Manager 1");
		    manager.setMemail("testManager1@zwvalley.com");
		    manager.setMpassword("123456");
		    managerDao.addManager(manager);
		    manager.setMname("test Manager 2");
		    manager.setMemail("testManager2@zwvalley.com");
		    manager.setMpassword("123");
		    managerDao.addManager(manager);
		    System.out.println("添加测试Managers成功");
		    
		    //查询数据 TODO
		    
		    //修改数据
		    manager.setManagerid(2);
		    manager.setMemail("updateMail@zwvalley.com");
		    manager.setMpassword("123456");
		    managerDao.updateManager(manager);
		    System.out.println("修改测试Manager成功");
		    
		    //删除数据
		    managerDao.deleteManager(1);
		    managerDao.deleteManager(2);
		    System.out.println("删除测试Manager成功");		    
		    
		}catch(Exception e){			
			e.printStackTrace();			
		}		
	}	
}
