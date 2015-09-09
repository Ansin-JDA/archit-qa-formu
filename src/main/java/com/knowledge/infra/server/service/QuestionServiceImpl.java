package com.knowledge.infra.server.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledge.infra.server.dao.QuestionDao;
import com.knowledge.infra.server.model.Question;
@Service 
public class QuestionServiceImpl implements QuestionService{

	private static Map<Integer, Integer> goodVote = new ConcurrentHashMap<Integer, Integer>();
	private static Map<Integer, Integer> badVote = new ConcurrentHashMap<Integer, Integer>();
	
	@Autowired
	private QuestionDao questionDao;
	
	
	public void addQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.addQuestion(question);
		
	}

	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.updateQuestion(question);
		
	}

	public void deleteQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.deleteQuestion(question.getQuestionid());
		
	}

	public List<Question> getQuestions(Map<String, Object> para) {
		// TODO Auto-generated method stub
		return questionDao.getQuestions(para);
	}
	
	public List<Question> getMoreQuestionsbyLastId(int lastQuestionId, Date lastTime, int len) {
		return questionDao.getMoreQuestionsbyLastId(lastQuestionId, lastTime, len);
	}

	public Question getQuestionbyId(int questionId) {
		// TODO Auto-generated method stub
		Map<String, Object> condition = new HashMap<String, Object>(1);
		condition.put("questionid", questionId);
		//TODELETE Test code
        for (int i=0; i < questionDao.getQuestions(condition).size(); i++) {
        	System.out.println(questionDao.getQuestions(condition).get(i).getQuestionid());
        	System.out.println(questionDao.getQuestions(condition).get(i).getQtitle());
        	System.out.println(questionDao.getQuestions(condition).get(i).getQcontent());
        }
        System.out.println("===========查询测试问题成功==========");
        //TODELETE Test code end
		return questionDao.getQuestions(condition).get(0);
	}

	public void voteQuestion(int questionid, int status) {
		// TODO Auto-generated method stub
		if(status>0){
		   if(goodVote.containsKey(questionid)){
                Integer num= goodVote.get(questionid);
                goodVote.put(questionid, num+1);
		   }else{
			   goodVote.put(questionid, 1); 
			   
		   }
			
		}else{
			   if(badVote.containsKey(questionid)){
	                Integer num= badVote.get(questionid);
	                badVote.put(questionid, num+1);
			   }else{
				   badVote.put(questionid, 1); 
				   
			   }
			
		}
	}
	
}
