package com.spdukraine.mvc.repository.dao;

import static org.junit.Assert.*;

import com.spdukraine.mvc.entity.Applicant;
import com.spdukraine.mvc.repository.impl.InMemoryDao;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ApplicantDaoTest {
    private GenericDao<Applicant, Integer> applicantDao = new InMemoryDao<Applicant, Integer>();

    @Before
    public void setUp(){
        for(int i = 0; i < 5; i++){
            Applicant applicant = new Applicant("Mike" + 1, "Red", "mred@gmail.com", "mikered");
            applicantDao.add(applicant);
        }
    }

    @Test
    public void testAdd(){
        int oldSize = applicantDao.list().size();
        Applicant applicant = new Applicant("Bob", "Martin", "bmartin@gmail.com", "bmartin");
        applicantDao.add(applicant);
        int newSize = applicantDao.list().size();

        assertFalse(oldSize == newSize);
    }

    @Test
    public void testRemove(){
        int oldSize = applicantDao.list().size();
        Applicant applicant = applicantDao.find(1);
        applicantDao.delete(applicant);
        int newSize = applicantDao.list().size();

        assertFalse(oldSize == newSize);
    }

    @Test
    public void testList(){
        List<Applicant> list = applicantDao.list();
        assertNotNull(list);
        assertFalse(list.isEmpty());
    }
}
