package com.example.testweb.jdbc.homeworkDept.model;

import java.util.List;

public interface DepartmentDao {

    Department findById(Integer id);

    Department findById2(Integer id);

    //使用匿名類別的row mapper(若只需要實作一次，就不須額外建一個新的RowMapper class)
    Department findById3(Integer id);

    List<Department> findAll();

    Department save(Department department);

    int update(Department department);
}
