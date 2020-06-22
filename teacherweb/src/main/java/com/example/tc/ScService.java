package com.example.tc;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ScService {
    List<Sc> getScList();
}
