package com.example.testweb.jdbc.homeworkDept.service;

import com.example.testweb.jdbc.homeworkDept.model.Department;
import com.example.testweb.jdbc.homeworkDept.model.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmetService {

    @Autowired
    private DepartmentDao departmentDao;

    public Department getDepartment(int id){
        return departmentDao.findById(id);
    }

    public List<Department> listAllDepartment(){
        return  departmentDao.findAll();
    }

    public Department insertDepartment(Department department) {
        return departmentDao.save(department);
    }

    public int updateDepartment(Department department, int deptNo) {
        department.setDeptNo(deptNo);
        return departmentDao.update(department);
    }
}
