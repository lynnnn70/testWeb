package com.example.testweb.jdbc.homeworkDept.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public Department getById(Integer id) {
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public Department save(Department department) {
        return null;
    }
}
