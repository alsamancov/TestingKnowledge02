package com.spdukraine.mvc.repository.impl;


import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.repository.dao.AnswerDao;
import com.spdukraine.mvc.repository.dao.HibernateDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("answerDao")
public class AnswerDaoImpl extends HibernateDao<Answer, Integer> implements AnswerDao {
    public List<Answer> getAnswersByQuestionId(Integer key){
        return currentSession().createQuery("from Answer a where a.questionId=key").list();
    }
}
