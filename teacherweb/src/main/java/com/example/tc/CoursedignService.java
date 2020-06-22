package com.example.tc;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CoursedignService {
    List<Coursedign> getCoursedignList();
    void addcsd(Coursedign coursedign);
    void clr();
}

