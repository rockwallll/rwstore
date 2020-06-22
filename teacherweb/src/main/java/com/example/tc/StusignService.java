package com.example.tc;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StusignService {
    List<Stusign> getStusignList();
    void addStus(Stusign stusign);
}
