package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TotalServiceimpl implements TotalService{
    @Autowired
    TotalMapper totalMapper;
    @Override
    public List<Total> gettotal() {
        List<Total> totals = totalMapper.gettotallist();
        return totals;
    }
}
