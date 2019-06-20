package com.qfedu.service;

import com.qfedu.entity.Grade;

import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/19.
 */
public interface GradeService {
    void addGrade(Grade grade);
    void delGrade(Grade grade);
    void updateGrade(Grade grade);

    Grade gradeById(Integer id);

    Map<String,Object> selectGrade(Integer page, Integer limit);

}
