package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StuServiceimpl implements StuService{
    @Autowired
    private StuMapper stuMapper;
    @Override
    public List<Student> getStuList() {
        return stuMapper.getStuList();
    }
}
