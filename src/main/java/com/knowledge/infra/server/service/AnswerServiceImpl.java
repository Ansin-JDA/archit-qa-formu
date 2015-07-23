package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.knowledge.infra.server.model.Answer;
@Service
public class AnswerServiceImpl implements AnswerService{

	
	private static Map<Integer, Integer> goodVote = new ConcurrentHashMap<Integer, Integer>();
	private static Map<Integer, Integer> badVote = new ConcurrentHashMap<Integer, Integer>();
	
	
	public void addAnswer(Answer Answer) {
		// TODO Auto-generated method stub
		
	}

	public void updateAnswer(Answer Answer) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAnswer(Answer Answer) {
		// TODO Auto-generated method stub
		
	}

	public List<Answer> getAnswers(Map<String, Object> para) {
		// TODO Auto-generated method stub
		return null;
	}

	public Answer getAnswer(int answer_id) {
		// TODO Auto-generated method stub
		return null;
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
