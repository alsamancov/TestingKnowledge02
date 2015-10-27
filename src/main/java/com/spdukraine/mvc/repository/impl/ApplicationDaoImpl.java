package com.spdukraine.mvc.repository.impl;


import com.spdukraine.mvc.entity.Applicant;
import com.spdukraine.mvc.repository.dao.ApplicantDao;
import com.spdukraine.mvc.repository.dao.HibernateDao;
import org.springframework.stereotype.Repository;

@Repository("applicantDao")
public class ApplicationDaoImpl extends HibernateDao<Applicant, Integer> implements ApplicantDao {
}
