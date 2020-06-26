package com.bear.springmvctest.service.impl;

import com.bear.springmvctest.component.Student;
import com.bear.springmvctest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午6:41
 * Description:
 */

@Service
@Primary
public class StudentServiceImpl implements StudentService {

    @Autowired
    private Student student;

    public Student getStudent() {
        student.setName("bear001");
        student.setClassroom("001");
        student.setAge(18);

        return student;
    }
}
