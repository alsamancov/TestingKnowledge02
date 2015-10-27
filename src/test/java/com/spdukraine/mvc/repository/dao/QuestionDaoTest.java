package com.spdukraine.mvc.repository.dao;

import static org.junit.Assert.*;

import com.spdukraine.mvc.entity.Question;
import com.spdukraine.mvc.repository.impl.InMemoryDao;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class QuestionDaoTest {

    private GenericDao<Question, Integer> questionDao = new InMemoryDao<Question, Integer>();

    @Before
    public void setUp(){
        for(int i = 0; i < 5; i++){
            Question question = new Question("How are you? " + i, 1);
        }
    }

    @Test
    public void testAdd(){
        int oldSize = questionDao.list().size();
        Question question = new Question("Are you OK?", 2);
        questionDao.add(question);
        int newSize = questionDao.list().size();

        assertFalse(oldSize == newSize);
    }

    @Test
    public void testRemove(){
        int oldSize = questionDao.list().size();
        Question question = questionDao.find(1);
        questionDao.delete(question);
        int newSize = questionDao.list().size();

        assertFalse(oldSize != newSize);
    }

    @Test
    public void testList(){
        List<Question> list = questionDao.list();
        assertNotNull (list);
        assertFalse(list.isEmpty());
    }
}
