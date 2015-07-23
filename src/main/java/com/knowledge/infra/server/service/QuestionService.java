package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Question;

public interface QuestionService {

		
		public void addQuestion(Question question);
		public void updateQuestion(Question question);
		public void deleteQuestion(Question question);
		public List<Question> getQuestions(Map<String,Object> para);
		public Question getQuestion(int questionId);
		void voteQuestion(int questionid, int status);

	

}
