package com.example.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CoursedignServiseimpl implements CoursedignService{
    @Autowired
    CoursedignMapper coursedignMapper;
    @Override
    public List<Coursedign> getCoursedignList() {
        List<Coursedign> coursedigns = coursedignMapper.getCoursedignList();
        return coursedigns;
    }

    @Override
    public void addcsd(Coursedign coursedign) {
        coursedignMapper.addcsd(coursedign);
    }

    @Override
    public void clr() {
        coursedignMapper.clr();
    }
}
