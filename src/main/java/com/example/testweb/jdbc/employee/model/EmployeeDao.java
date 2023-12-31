package com.example.testweb.jdbc.employee.model;

import java.util.List;

public interface EmployeeDao {
    Employee findById(int id);

    Employee getById(int id);

    Employee getById2(int id);
    List<Employee> findAll();
    Employee save(Employee employee);

    int update(Employee employee);


}
