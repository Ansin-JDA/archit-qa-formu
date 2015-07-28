package com.knowledge.infra.server.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Answer;

public interface AnswerDao {

	public List<Answer> getAnswers(Map<String, Object> param);
	public void addAnswer(Answer answer);
    public void updateAnswer(Answer answer);
    public void deleteAnswer(int answerId);
    public List<Answer> getMoreAnswersbyLastId(int questionId,int lastAnswerId,Date lastTime,int len);
}
