package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CourseServiceimpl implements CourseService{
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }

//    @Override
//    public List<Answer> findAnswer(int ID) {
//        List<Answer> ans=answerMapper.findAnswer(ID);
//        return ans;
//    }

    @Override
    public List<Course> getCourse() {
        List<Course> courses = courseMapper.getCourseList();
        return courses;
    }

    @Override
    public void addStu(Course course) {
        courseMapper.addStu(course);
    }


}
