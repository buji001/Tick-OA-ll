package com.qfedu.service;

import com.qfedu.entity.Staff;

import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/18.
 */
public interface StaffService {
    void addStaff(Staff staff);
    void delStaff(Staff staff);
    void updateStaff(Staff staff);

    Map<String,Object> selectStaff(Integer page,Integer limit);

    Staff staffByNo(Integer no);
}
