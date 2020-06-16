package com.example.tc;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseMapper {
    @Update("update Answer set  "
            + "answer = #{answer},  "
            + "grade  = #{grade}    "
            + "where ID = #{ID} ")
    void updateCourse(Course course);
    @Insert("insert into course(cno,cname,sname,snumber) values(#{cno},#{cname},#{sname},#{snumber})")
    void addStu(Course course);
    //    @Select("Select * from Answer where ID=#{ID}")
//    List<Answer> findAnswer(int ID);
    @Select("select * from course order by cno")
             List<Course> getCourseList();
}
