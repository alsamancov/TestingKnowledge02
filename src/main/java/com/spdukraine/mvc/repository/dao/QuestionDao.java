package com.spdukraine.mvc.repository.dao;


import com.spdukraine.mvc.entity.Question;

import java.util.List;

public interface QuestionDao {
    public void add(Question question);
    public void delete(int id);
    public Question findQuestionById(int id);
    public void update(Question question);
    public List<Question> getAllQuestion();
}
