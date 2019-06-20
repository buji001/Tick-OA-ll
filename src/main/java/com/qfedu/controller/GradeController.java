package com.qfedu.controller;

import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
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
public class GradeController {
    @Autowired
    GradeService gradeService;

    @RequestMapping("/addGrade")
    public JsonBean addGrade(Grade grade){
        gradeService.addGrade(grade);
        return new JsonBean(1,null);
    }

    @RequestMapping("/delGrade")
    public JsonBean delGrade(Grade grade){
        gradeService.delGrade(grade);
        return new JsonBean(1,null);
    }

    @RequestMapping("/updateGrade")
    public JsonBean updateGrade(Grade grade){
        gradeService.updateGrade(grade);
        return new JsonBean(1,null);
    }

    @RequestMapping("/selectGrade")
    public Map<String,Object> selectGrade(Integer page,Integer limit){
        Map<String, Object> map = gradeService.selectGrade(page, limit);
        return map;
    }

    @RequestMapping("/gradeById.do")
    public JsonBean gradeById(Integer id){
        Grade grade = gradeService.gradeById(id);
        return new JsonBean(1,grade);
    }
}





