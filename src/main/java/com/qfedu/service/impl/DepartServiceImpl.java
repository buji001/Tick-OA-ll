package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.DepartDao;
import com.qfedu.entity.Depart;
import com.qfedu.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/18.
 */

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    DepartDao departDao;

    @Override
    public void addDepart(Depart depart){
        departDao.addDepart(depart);
    }

    @Override
    public void delDepart(Depart depart){
        departDao.delDepart(depart);
    }

    @Override
    public void updateDepart(Depart depart){
        departDao.updateDepart(depart);
    }

    @Override
    public Map<String,Object> selectDepart(Integer page,Integer limit){
        PageHelper.startPage(page, limit);

        List<Depart> list = departDao.selectDepart();

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

    @Override
    public Depart departById(Integer id) {
        return departDao.departById(id);
    }
}





