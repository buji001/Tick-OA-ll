package com.qfedu.dao;

import com.qfedu.entity.Course;

import java.util.List;

/**
 * Created by wujun on 2019/6/19.
 */
public interface CourseDao {
    void addCourse(Course course);
    void delCourse(Course course);
    void updateCourse(Course course);
    List<Course> selectCourse();
    Course courseById(Integer id);
}
