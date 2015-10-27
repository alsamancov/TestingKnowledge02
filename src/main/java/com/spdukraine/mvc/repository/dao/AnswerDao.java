package com.spdukraine.mvc.repository.dao;


import com.spdukraine.mvc.entity.Answer;

import java.util.List;

public interface AnswerDao {
    public void add(Answer answer);
    public void delete(int id);
    public Answer findAnswerById(int id);
    public void updateAnswer(Answer answer);
    public List<Answer> getAllAnswer();
    public List<Answer> findAnswerByQuestionId(int questionId);
}
