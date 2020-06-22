package com.example.tc;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ScMapper {
    @Select("select * from sc order by snumber")
    List<Sc> getScList();
}
