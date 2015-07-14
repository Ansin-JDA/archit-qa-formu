package com.knowledge.infra.server.dao;

import com.knowledge.infra.server.model.Question;

public interface QuestionDao {
   
    public void addQuestion(Question Question);
    public void updateQuestion(Question Question);
    public void deleteQuestion(int QuestionId);
}
