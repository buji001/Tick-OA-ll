package com.qfedu.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.StaffDao;
import com.qfedu.entity.Staff;
import com.qfedu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/18.
 */

@Service
public class StaffServiceImpl implements StaffService{

    @Autowired
    StaffDao staffDao;

    @Override
    public void addStaff(Staff staff) {
        staffDao.addStaff(staff);
    }

    @Override
    public void delStaff(Staff staff) {
        staffDao.delStaff(staff);
    }

    @Override
    public void updateStaff(Staff staff) {
        staffDao.updateStaff(staff);
    }

    @Override
    public Map<String, Object> selectStaff(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);

        List<Staff> list = staffDao.selectStaff();

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
    public Staff staffByNo(Integer no) {
        return staffDao.staffByNo(no);
    }


}





