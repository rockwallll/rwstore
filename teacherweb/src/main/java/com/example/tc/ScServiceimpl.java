package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ScServiceimpl implements ScService{
    @Autowired
    private ScMapper scMapper;
    @Override
    public List<Sc> getScList() {
        return scMapper.getScList();
    }
}
