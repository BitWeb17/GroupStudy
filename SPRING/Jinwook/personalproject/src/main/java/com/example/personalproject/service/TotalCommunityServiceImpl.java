package com.example.personalproject.service;

import java.util.List;

import com.example.personalproject.entity.TotalCommunity;
import com.example.personalproject.repository.TotalcommunityRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TotalCommunityServiceImpl implements TotalCommunityService {

    @Autowired
    private TotalcommunityRepo TotalcommunityRepo;

    @Override
    public List<TotalCommunity> totallist() throws Exception {
        // TODO Auto-generated method stub
        return TotalcommunityRepo.totallist();
    }

    @Override
    public void register(TotalCommunity totallist) throws Exception {
        // TODO Auto-generated method stub
        TotalcommunityRepo.create(totallist);
    }

    @Override
    public TotalCommunity read(Integer boardNo) throws Exception {
        // TODO Auto-generated method stub
        return TotalcommunityRepo.read(boardNo);
    }

    @Override
    public void remove(Integer boardNo) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public void modify(TotalCommunity totallist) throws Exception {
        // TODO Auto-generated method stub

    }
    
}
