package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/19.
 */

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeDao gradeDao;

    @Override
    public void addGrade(Grade grade) {
        gradeDao.addGrade(grade);
    }

    @Override
    public void delGrade(Grade grade) {
        gradeDao.delGrade(grade);
    }

    @Override
    public void updateGrade(Grade grade) {
        gradeDao.updateGrade(grade);
    }

    @Override
    public Grade gradeById(Integer id) {
        return gradeDao.gradeById(id);
    }

    @Override
    public Map<String, Object> selectGrade(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Grade> list = gradeDao.selectGrade();

        // 获取总记录数
        long total = ((Page) list).getTotal();
        // 获取总页数
        int pages = ((Page) list).getPages();

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }


}





