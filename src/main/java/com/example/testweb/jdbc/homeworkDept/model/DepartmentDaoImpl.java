package com.example.testweb.jdbc.homeworkDept.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;


@Repository
public class DepartmentDaoImpl implements DepartmentDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Department findById(Integer id) {
        final String sql = "SELECT DEPTNO, DNAME, LOC FROM dept2 WHERE DEPTNO = ?";
        // 1.
//          return jdbcTemplate.query(sql, new DepartmentRowMapper(),id)
//          .stream().findFirst().orElse(null);

        // 2.長度為0時 return null(因為就算為0也會回傳空字串，所以要做判斷)
        // 如果不做 list.isEmpty() 的判斷，直接使用 list.get(0) 返回列表的第一個元素，可能會引起一些潛在的問題，特別是在沒有查詢結果時。
        // 若沒查詢到結果，list 會是一個空列表（size 為 0），直接使用 list.get(0) 會導致 IndexOutOfBoundsException
        List<Department> list = jdbcTemplate.query(sql, new DepartmentRowMapper(), id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    //使用匿名類別的row mapper(若只需要實作一次，就不須額外建一個新的RowMapper class)
    @Override
    public Department findById2(Integer id) {
        final String sql = "SELECT DEPTNO, DNAME, LOC FROM dept2 WHERE DEPTNO = ?";

       //1.
//        return jdbcTemplate.query(sql,(rs, rowNum) -> {
//            Department department = new Department();
//            department.setDeptNo(rs.getInt("deptNo"));
//            department.setDeptName(rs.getString("deptName"));
//            department.setLoc(rs.getString("loc"));
//            return department;
//        },id).stream().findFirst().orElse(null);

        //2.this::departmentMapRow這個類別裡的方法引用
        return jdbcTemplate.query(sql, this::departmentMapRow, id)
                           .stream().findFirst().orElse(null);
    }

    //3.
    public Department findById3(Integer id){
        final String sql = "SELECT DEPTNO, DNAME, LOC FROM dept2 WHERE DEPTNO = ?";

        return jdbcTemplate.query(sql, new RowMapper<Department>() {
            @Override
            public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
                Department department = new Department();
                department.setDeptNo(rs.getInt("deptNo"));
                department.setDeptName(rs.getString("deptName"));
                department.setLoc(rs.getString("loc"));
                return department;
            }
        }).stream().findFirst().orElse(null);

    }

    protected Department departmentMapRow (ResultSet rs, int rowNo) throws SQLException{
        Department department = new Department();
        department.setDeptNo(rs.getInt("deptNo"));
        department.setDeptName(rs.getString("deptName"));
        department.setLoc(rs.getString("loc"));
        return department;

    }

    @Override
    public List<Department> findAll() {
        final String sql = "SELECT DEPTNO, DNAME, LOC FROM dept2";

        return jdbcTemplate.query(sql, new DepartmentRowMapper());
    }

    @Override
    public Department save(Department department) {
        final String sql = "INSERT INTO dept2(DNAME, LOC) VALUES(?,?)";

        //KeyHolder用於保存自動生成的主鍵
        KeyHolder keyHolder = new GeneratedKeyHolder();
        //PreparedStatement是Java JDBC API中的一個接口，用於執行預編譯的SQL語句，可接受帶有佔位符的SQL查詢
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement pst = con.prepareStatement(sql,new String[]{"deptNo"});
                pst.setString(1, department.getDeptName());
                pst.setString(2,department.getLoc());
                return pst;
            }

        }, keyHolder);

        //從keyHoder 中檢索生成的主鍵
        Number key = keyHolder.getKey();
        //如果有自動生成主鍵，將其設置在Department對象中
        if (key != null){
            department.setDeptNo(key.intValue());
        }
        return department;
    }

    //jdbcTemplate.update方法回傳的是受影響的行數，而不是更新後的實體
    @Override
    public int update(Department department) {
        final String sql = "UPDATE dept2 SET DNAME=?, LOC=? WHERE DEPTNO =? ";
        return jdbcTemplate.update(sql, department.getDeptName(), department.getLoc(), department.getDeptNo());


    }
}
