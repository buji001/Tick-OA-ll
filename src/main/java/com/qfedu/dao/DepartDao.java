package com.qfedu.dao;

import com.qfedu.entity.Depart;

import java.util.List;

/**
 * Created by wujun on 2019/6/18.
 */
public interface DepartDao {
    void addDepart(Depart depart);
    void delDepart(Depart depart);
    void updateDepart(Depart depart);
    List<Depart> selectDepart();
    Depart departById(Integer id);
}
