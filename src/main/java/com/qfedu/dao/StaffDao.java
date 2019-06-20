package com.qfedu.dao;

import com.qfedu.entity.Staff;

import java.util.List;

/**
 * Created by wujun on 2019/6/18.
 */
public interface StaffDao {
    void addStaff(Staff staff);
    void delStaff(Staff staff);
    void updateStaff(Staff staff);
    List<Staff> selectStaff();

    Staff staffByNo(Integer no);

}
