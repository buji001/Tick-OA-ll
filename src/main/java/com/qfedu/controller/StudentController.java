package com.qfedu.controller;

import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/19.
 */

@Controller
@ResponseBody
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/addStudent,do")
    public JsonBean addStudent(Student student){
        studentService.addStudent(student);
        return new JsonBean(1,null);
    }

    @RequestMapping("/delStudent,do")
    public JsonBean delStudent(Student student){
        studentService.delStudent(student);
        return new JsonBean(1,null);
    }

    @RequestMapping("/updateStudent.do")
    public JsonBean updateStudent(Student student){
        studentService.updateStudent(student);
        return new JsonBean(1,null);
    }

    @RequestMapping("/selectStudent.do")
    public Map<String,Object> selectStudent(Integer page,Integer limit){
        Map<String, Object> map = studentService.selectStudent(page, limit);
        return map;
    }

    @RequestMapping("/studentByNo.do")
    public JsonBean studentByNo(String no){
        Student student = studentService.studentByNo(no);

        return new JsonBean(1,student);
    }

}





