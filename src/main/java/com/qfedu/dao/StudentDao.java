package com.qfedu.dao;

import com.qfedu.entity.Student;

import java.util.List;

/**
 * Created by wujun on 2019/6/19.
 */
public interface StudentDao {
    void addStudent(Student student);
    void delStudent(Student student);
    void updateStudent(Student student);
    List<Student> selectStudent();
    Student studentByNo(String no);
}
