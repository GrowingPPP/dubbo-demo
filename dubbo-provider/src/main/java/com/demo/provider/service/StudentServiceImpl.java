package com.demo.provider.service;

import com.demo.api.Student;
import com.demo.api.StudentService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudent(String id) {
        return new Student(10,id);
    }
}
