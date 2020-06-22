package com.example.tc;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface StusignMapper {
    @Select("select * from studentsign order by cno")
    List<Stusign> getStusignList();
    @Insert("insert into studentsign(cno,snumber,czno,stusigntime) values(#{cno},#{snumber},#{czno},#{stusigntime})")
    void addStus(Stusign stusign);
}
