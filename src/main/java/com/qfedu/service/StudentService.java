package com.qfedu.service;

import com.qfedu.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/19.
 */
public interface StudentService {
    void addStudent(Student student);
    void delStudent(Student student);
    void updateStudent(Student student);
    Map<String,Object> selectStudent(Integer page,Integer limit);

    Student studentByNo(String no);
}
