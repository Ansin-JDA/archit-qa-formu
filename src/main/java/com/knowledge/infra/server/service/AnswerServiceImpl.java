package com.knowledge.infra.server.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledge.infra.server.dao.AnswerDao;
import com.knowledge.infra.server.model.Answer;
@Service
public class AnswerServiceImpl implements AnswerService{

	
	private static Map<Integer, Integer> goodVote = new ConcurrentHashMap<Integer, Integer>();
	private static Map<Integer, Integer> badVote = new ConcurrentHashMap<Integer, Integer>();
	
	@Autowired
	private AnswerDao answerDao;
	
	
	public void addAnswer(Answer answer) {
		// TODO Auto-generated method stub
		answerDao.addAnswer(answer);
		
	}

	public void updateAnswer(Answer answer) {
		// TODO Auto-generated method stub
		answerDao.updateAnswer(answer);
		
	}

	public void deleteAnswer(Answer answer) {
		// TODO Auto-generated method stub
		answerDao.deleteAnswer(answer.getAnswerid());
		
	}

	public List<Answer> getAnswers(Map<String, Object> para) {
		// TODO Auto-generated method stub
		return answerDao.getAnswers(para);
	}

	public Answer getAnswer(int answerId) {
		// TODO Auto-generated method stub
		Map<String, Object> condition = new HashMap<String, Object>(1);
		condition.put("answerid", answerId);
        for (int i=0; i < answerDao.getAnswers(condition).size(); i++) {
        	System.out.println(answerDao.getAnswers(condition).get(i).getAnswerid());
        	System.out.println(answerDao.getAnswers(condition).get(i).getAtitle());
        	System.out.println(answerDao.getAnswers(condition).get(i).getAcontent());
        }
        System.out.println("===========查询测试问题成功==========");
		return answerDao.getAnswers(condition).get(0);
	}

	public void voteAnswer(int answerid, int status) {
		// TODO Auto-generated method stub
		if(status>0){
		   if(goodVote.containsKey(answerid)){
                Integer num= goodVote.get(answerid);
                goodVote.put(answerid, num+1);
		   }else{
			   goodVote.put(answerid, 1); 
			   
		   }
			
		}else{
			   if(badVote.containsKey(answerid)){
	                Integer num= badVote.get(answerid);
	                badVote.put(answerid, num+1);
			   }else{
				   badVote.put(answerid, 1); 
				   
			   }
			
		}
		
		
	}



}
