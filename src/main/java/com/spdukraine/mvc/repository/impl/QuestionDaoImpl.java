package com.spdukraine.mvc.repository.impl;


import com.spdukraine.mvc.entity.Question;
import com.spdukraine.mvc.repository.dao.HibernateDao;
import com.spdukraine.mvc.repository.dao.QuestionDao;
import org.springframework.stereotype.Repository;

@Repository("questionDao")
public class QuestionDaoImpl extends HibernateDao<Question, Integer> implements QuestionDao {

}
