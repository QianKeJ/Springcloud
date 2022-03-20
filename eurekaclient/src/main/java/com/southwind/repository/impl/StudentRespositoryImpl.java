package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRespository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRespositoryImpl implements StudentRespository {

    private static Map<String,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put("1",new Student("1","张三",18));
        studentMap.put("2",new Student("2","李四",17));
        studentMap.put("3",new Student("3","王二麻子",19));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public int count() {
        return studentMap.size();
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);

    }

    @Override
    public void deleteById(String id) {
        studentMap.remove(id);
    }
}
