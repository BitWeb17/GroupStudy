package com.example.personalproject.service;

import java.util.List;

import com.example.personalproject.entity.TotalCommunity;
import com.example.personalproject.repository.TotalCommunityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TotalCommunityServiceImpl implements TotalCommunityService {

    @Autowired
    private TotalCommunityRepository totalCommunityRepo;

    @Override
    public List<TotalCommunity> list() throws Exception {
        // TODO Auto-generated method stub
        return totalCommunityRepo.list();
    }

    @Override
    public void register(TotalCommunity totalCommunity) throws Exception {
        // TODO Auto-generated method stub
        totalCommunityRepo.create(totalCommunity);
    }

    @Override
    public TotalCommunity read(Integer boardNo) throws Exception {
        // TODO Auto-generated method stub
        return totalCommunityRepo.read(boardNo);
    }

    @Override
    public void remove(Integer boardNo) throws Exception {
        // totalCommunityRepo.remove(boardNo);

    }

    @Override
    public void modify(TotalCommunity totalCommunity) throws Exception {
        // TODO Auto-generated method stub
        // totalCommunityRepo.modify(totalCommunity);
    }
    
}

