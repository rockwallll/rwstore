package com.example.tc;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TotalMapper {
    @Select("select * from totalnumbersign")
    List<Total> gettotallist();
}
