package com.yu.mapper;

import com.yu.pojo.Dept;

public interface DeptMapper {
    /*根据did查询部门*/
    Dept getDeptById(int did);
}
