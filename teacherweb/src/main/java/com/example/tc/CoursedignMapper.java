package com.example.tc;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CoursedignMapper {
    @Select("select * from coursedign order by cno")
    List<Coursedign> getCoursedignList();
    @Insert("insert into coursedign(cno,cname,csigntime,csignposiL,csignposiW,signtimelast,csigned,czno) values(#{cno},#{cname},#{csigntime},#{csignposiL},#{csignposiW},#{signtimelast},#{csigned},#{czno})")
    void addcsd(Coursedign coursedign);
    @Update("truncate table coursedign")
    void clr();
}
