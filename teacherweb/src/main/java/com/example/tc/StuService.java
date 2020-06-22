package com.example.tc;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StuService {
    List<Student> getStuList();
}
