package com.example.tc;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CoursesService {
    List<Courses> getCoursesList();
    void addCous(Courses courses);
}
