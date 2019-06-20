package com.qfedu.service;

import com.qfedu.entity.Course;

import java.util.Map;

/**
 * Created by wujun on 2019/6/19.
 */
public interface CourseService {
    void addCourse(Course course);
    void delCourse(Course course);
    void updateCourse(Course course);
    Map<String,Object> selectCourse(Integer page,Integer limit);
    Course courseById(Integer id);
}
