package com.spdukraine.mvc.repository.dao;


import com.spdukraine.mvc.entity.Applicant;

import java.util.List;

public interface ApplicantDao {
    public void add(Applicant applicant);
    public void delete(int id);
    public Applicant findApplicantById(int id);
    public void update(Applicant applicant);
    public List<Applicant> getAllApplicant();
}
