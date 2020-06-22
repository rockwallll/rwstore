package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CoursesServiceimpl implements CoursesService{
    @Autowired
    private CoursesMapper CoursesMapper;
    @Override
    public List<Courses> getCoursesList() {
        return CoursesMapper.getCoursesList();
    }

    @Override
    public void addCous(Courses courses) {

    }

}
