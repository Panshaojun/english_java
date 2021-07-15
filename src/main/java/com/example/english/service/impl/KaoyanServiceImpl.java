package com.example.english.service.impl;

import com.example.english.entity.Kaoyan;
import com.example.english.mapper.KaoyanMapper;
import com.example.english.service.KaoyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KaoyanServiceImpl implements KaoyanService {

    @Autowired
    private KaoyanMapper kaoyanMapper;

    @Override
    public Kaoyan selectById(Integer id){
        return kaoyanMapper.selectById(id);
    }
}
