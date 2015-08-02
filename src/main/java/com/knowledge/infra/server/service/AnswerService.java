package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Answer;

public interface AnswerService {
	
	public void addAnswer(Answer Answer);
	public void updateAnswer(Answer Answer);
	public void deleteAnswer(Answer Answer);
	public List<Answer> getAnswers(Map<String,Object> para);
	public Answer getAnswer(int answerid);
	public void voteAnswer(int answerid, int status);

}
