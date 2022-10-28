package com.example.java20.week4.demo.university.respository.impl;


import com.example.java20.week4.demo.university.domain.entity.Teacher;
import com.example.java20.week4.demo.university.domain.entity.Teacher_Student;
import com.example.java20.week4.demo.university.respository.Teacher_StudentCustomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class Teacher_StudentCustomRepoImpl implements Teacher_StudentCustomRepo {
    private final EntityManager entityManager;

    @Autowired
    public Teacher_StudentCustomRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Teacher_Student insert(Teacher_Student ts) {
        entityManager.persist(ts);
        return ts;
    }

    @Override
    public Teacher_Student delete(String id) {
        Teacher_Student ts = new Teacher_Student();
        entityManager.persist(ts);
        return ts;
    }

    @Override
    public Teacher_Student update(String id, Teacher_Student ts) {
        // need to be done more.
        entityManager.find(Teacher.class, ts.getId());
        entityManager.merge(ts);
        return null;
    }
}
