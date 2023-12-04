package com.example.testweb.jdbc.homeworkDept.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//JdbcTemplate中的 RowMapper 用於映射資料庫表格的內容
//RowMapper是一個接口，定義了將ResultSet中的每一行數據映射到Java物件的方式
//JdbcTemplate會執行sql查詢，並將結果的每一行數據傳遞給RowMapper 來創建相應的Java物件
public class DepartmentRowMapper implements RowMapper<Department> {
    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
        Department department = new Department();
        department.setDeptNo(rs.getInt("DEPTNO"));
        department.setDeptName(rs.getString("DNAME"));
        department.setLoc(rs.getString("LOC"));

        return department;
    }
}
