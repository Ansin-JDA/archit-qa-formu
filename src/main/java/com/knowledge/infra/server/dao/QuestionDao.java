package com.knowledge.infra.server.dao;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Question;

public interface QuestionDao {
	
    public List<Question> getQuestions(Map<String, Object> param);
    public void addQuestion(Question Question);
    public void updateQuestion(Question Question);
    public void deleteQuestion(int QuestionId);
}
