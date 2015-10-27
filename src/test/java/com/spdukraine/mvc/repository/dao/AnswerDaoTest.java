package com.spdukraine.mvc.repository.dao;

import static org.junit.Assert.*;

import com.spdukraine.mvc.entity.Answer;
import com.spdukraine.mvc.repository.impl.InMemoryDao;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AnswerDaoTest {

    private GenericDao<Answer, Integer> answerDao = new InMemoryDao<Answer, Integer>();

    @Before
    public void setUp(){
        for(int i = 0; i < 5; i++){
            Answer answer = new Answer("I am OK!" + i, true);
            answerDao.add(answer);
        }
    }

    @Test
    public void testAdd(){
        int oldSize = answerDao.list().size();
        Answer answer = new Answer("You are OK!", false);
        answerDao.add(answer);
        int newSize = answerDao.list().size();

        assertFalse(oldSize == newSize);
    }

    @Test
    public void testRemove(){
        int oldSize = answerDao.list().size();
        Answer answer = answerDao.find(1);
        answerDao.delete(answer);
        int newSize = answerDao.list().size();

        assertFalse(oldSize == newSize);
    }

    @Test
    public void testList(){
        List<Answer> list = answerDao.list();
        assertNotNull(list);
        assertFalse(list.isEmpty());
    }
}
