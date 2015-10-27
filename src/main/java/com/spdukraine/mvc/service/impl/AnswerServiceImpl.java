package com.spdukraine.mvc.service.impl;


import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.repository.dao.AnswerDao;
import com.spdukraine.mvc.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerDao answerDao;

    @Override
    public void add(Answer entity) {
        answerDao.add(entity);
    }

    @Override
    public void update(Answer entity) {
        answerDao.update(entity);
    }

    @Override
    public void delete(Answer entity) {
        answerDao.delete(entity);
    }

    @Override
    public Answer find(Integer key) {
        return this.answerDao.find(key);
    }

    @Override
    public List<Answer> list() {
        return this.answerDao.list();
    }
}
