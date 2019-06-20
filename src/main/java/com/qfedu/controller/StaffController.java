package com.qfedu.controller;

import com.qfedu.entity.Staff;
import com.qfedu.service.StaffService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/18.
 */
@Controller
@ResponseBody
public class StaffController {

    @Autowired
    StaffService staffService;

    @RequestMapping("/addStaff.do")
    public JsonBean addStaff(Staff staff){
        staffService.addStaff(staff);

    return new JsonBean(1,null);
    }

    @RequestMapping("/delStaff.do")
    public JsonBean delStaff(Staff staff){
        staffService.delStaff(staff);
        return new JsonBean(1,null);
    }

    @RequestMapping("/updateStaff.do")
    public JsonBean updateStaff(Staff staff){
        staffService.updateStaff(staff);
        return new JsonBean(1,null);
    }

    @RequestMapping("/selectStaff.do")
    public Map<String,Object> selectStaff(Integer page,Integer limit){
        Map<String, Object> map = staffService.selectStaff(page, limit);
        return map;
    }

    @RequestMapping("/staffByNo.do")
    public JsonBean staffByNo(Integer no){
        Staff staff = staffService.staffByNo(no);
        return new JsonBean(1,staff);
    }

}





