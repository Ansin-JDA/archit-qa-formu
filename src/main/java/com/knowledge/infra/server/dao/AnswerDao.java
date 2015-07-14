package com.knowledge.infra.server.dao;

import com.knowledge.infra.server.model.Answer;

public interface AnswerDao {

	
	public void addAnswer(Answer Answer);
    public void updateAnswer(Answer Answer);
    public void deleteAnswer(int AnswerId);
}
