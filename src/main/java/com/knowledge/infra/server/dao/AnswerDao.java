package com.knowledge.infra.server.dao;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Answer;

public interface AnswerDao {

	public List<Answer> getAnswers(Map<String, Object> param);
	public void addAnswer(Answer Answer);
    public void updateAnswer(Answer Answer);
    public void deleteAnswer(int AnswerId);
}
