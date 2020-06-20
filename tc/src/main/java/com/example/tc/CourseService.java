package com.example.tc;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CourseService {
    void updateCourse(Course course);
    List<Course> getCourse();
    void addStu(Course course);
    void delStu(String sname);
}
