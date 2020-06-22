package com.example.tc;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface StuMapper {
    @Select("select * from student order by sno")
    List<Student> getStuList();
}
