package com.qfedu.service;

import com.qfedu.entity.Depart;

import java.util.List;
import java.util.Map;

/**
 * Created by wujun on 2019/6/18.
 */
public interface DepartService {
    void addDepart(Depart depart);
    void delDepart(Depart depart);
    void updateDepart(Depart depart);
    Map<String,Object> selectDepart(Integer page, Integer limit);

    Depart departById(Integer id);

}
