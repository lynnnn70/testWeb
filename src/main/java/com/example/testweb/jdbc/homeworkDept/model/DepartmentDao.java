package com.example.testweb.jdbc.homeworkDept.model;

import java.util.List;

public interface DepartmentDao {

    Department findById(Integer id);

    Department getById(Integer id);

    List<Department> findAll();

    Department save(Department department);
}
