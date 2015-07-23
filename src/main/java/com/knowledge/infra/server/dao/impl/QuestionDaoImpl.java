package com.knowledge.infra.server.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.knowledge.infra.server.dao.QuestionDao;
import com.knowledge.infra.server.model.Question;

@Component("questionDao")
public class QuestionDaoImpl extends SqlSessionDaoSupport implements QuestionDao{
    private static final String QUESTION_DAO_NAMESPACE="com.knowledge.infra.server.dao.QuestionDao.";

	public void addQuestion(Question question) {
		// TODO Auto-generated method stub
		 this.getSqlSession().insert(QUESTION_DAO_NAMESPACE+"addQuestion", question);
	}

	public void updateQuestion(Question question) {
		// TODO Auto-generated method stub
		this.getSqlSession().update(QUESTION_DAO_NAMESPACE+"updateQuestion", question);
	}

	public void deleteQuestion(int QuestionId) {
		// TODO Auto-generated method stub
		this.getSqlSession().delete(QUESTION_DAO_NAMESPACE+"deleteQuestion", QuestionId);		
	}

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public List<Question> getQuestions(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList(QUESTION_DAO_NAMESPACE+"getQuestionsbyMap", param);
	}
	
	

}
