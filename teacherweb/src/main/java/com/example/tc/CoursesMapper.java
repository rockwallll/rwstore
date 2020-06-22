package com.example.tc;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CoursesMapper {
    @Select("select * from courses order by cn")
    List<Courses> getCoursesList();
    @Insert("insert into courses(cn,cna) values(#{cn},#{cna}")
    void addCous(Courses courses);
}
