package com.example.testweb.jdbc.homeworkDept.controller;

import com.example.testweb.jdbc.homeworkDept.model.Department;
import com.example.testweb.jdbc.homeworkDept.service.DepartmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class DepartmentController {

    @Autowired
    private DepartmetService departmetService;

    @GetMapping("department/{id}")
    public ResponseEntity<Department> findDepartment(@PathVariable Integer id){
        return new ResponseEntity<>(departmetService.getDepartment(id),HttpStatus.OK);
    }

    @GetMapping("departments")
    public ResponseEntity<List<Department>> findDepartments(){
        return new ResponseEntity<>(departmetService.listAllDepartment(), HttpStatus.OK);
    }

    @PostMapping("insert")
    public ResponseEntity<Department> insertDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmetService.insertDepartment(department),HttpStatus.CREATED);
    }

    @PutMapping("update/{deptNo}")
    public ResponseEntity<?> updateDepartment(@RequestBody Department department,
                                                       @PathVariable int deptNo){
        return new ResponseEntity<>(departmetService.updateDepartment(department, deptNo), HttpStatus.OK);
    }

}
