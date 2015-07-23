package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.knowledge.infra.server.model.Question;
@Service 
public class QuestionServiceImpl implements QuestionService{

	private static Map<Integer, Integer> goodVote = new ConcurrentHashMap<Integer, Integer>();
	private static Map<Integer, Integer> badVote = new ConcurrentHashMap<Integer, Integer>();
	
	public void addQuestion(Question Question) {
		// TODO Auto-generated method stub
		
	}

	public void updateQuestion(Question Question) {
		// TODO Auto-generated method stub
		
	}

	public void deleteQuestion(Question Question) {
		// TODO Auto-generated method stub
		
	}

	public List<Question> getQuestions(Map<String, Object> para) {
		// TODO Auto-generated method stub
		return null;
	}

	public Question getQuestion(int questionId) {
		// TODO Auto-generated method stub
		return null;
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
