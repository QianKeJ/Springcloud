package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRespository {

    public Collection<Student> findAll();
    public int count();
    public Student findById(String id);
    public void saveOrUpdate(Student student);
    public void deleteById(String id);
}
