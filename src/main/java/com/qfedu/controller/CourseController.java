package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/19.
 */

@Controller
@ResponseBody
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/addCourse.do")
    public JsonBean addCourse(Course course){

        courseService.addCourse(course);

        return new JsonBean(1,null);
    }

    @RequestMapping("/delCourse.do")
    public JsonBean delCourse(Course course){
        courseService.delCourse(course);
        return new JsonBean(1,null);
    }

    @RequestMapping("/updateCourse.do")
    public JsonBean updateCourse(Course course){
        courseService.updateCourse(course);
        return new JsonBean(1,null);
    }

    @RequestMapping("/selectCourse.do")
    public Map<String,Object> selectCourse(Integer page,Integer limit){
        Map<String, Object> map = courseService.selectCourse(page, limit);
        return map;
    }

    @RequestMapping("/courseById.do")
    public JsonBean courseById(Integer id){
        Course course = courseService.courseById(id);
        return new JsonBean(1,course);
    }
}





