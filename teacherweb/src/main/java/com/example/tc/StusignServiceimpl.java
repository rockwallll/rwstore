package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StusignServiceimpl implements StusignService{
    @Autowired
    StusignMapper stusignMapper;
    @Override
    public List<Stusign> getStusignList() {
        return stusignMapper.getStusignList();
    }

    @Override
    public void addStus(Stusign stusign) {
        stusignMapper.addStus(stusign);
    }
}
