package com.qfedu.dao;

import com.qfedu.entity.Grade;

import java.util.List;

/**
 * Created by wujun on 2019/6/19.
 */
public interface GradeDao {
    void addGrade(Grade grade);
    void delGrade(Grade grade);
    void updateGrade(Grade grade);
    List<Grade> selectGrade();
    Grade gradeById(Integer id);
}
