package com.example.personalproject.service;

import java.util.List;

import com.example.personalproject.entity.TotalCommunity;
import com.example.personalproject.repository.TotalcommunityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TotalCommunityServiceImpl implements TotalCommunityService {

    @Autowired
    private TotalcommunityRepository totalcommunityRepo;

    @Override
    public List<TotalCommunity> list() throws Exception {
        // TODO Auto-generated method stub
        return totalcommunityRepo.list();
    }

    @Override
    public void register(TotalCommunity totalCommunity) throws Exception {
        // TODO Auto-generated method stub
        totalcommunityRepo.create(totalCommunity);
    }

    // @Override
    // public TotalCommunity read(Long boardNo) throws Exception {
    //     // TODO Auto-generated method stub
    //     return totalcommunityRepo.read(boardNo);
    // }

    // @Override
    // public void remove(Long boardNo) throws Exception {
    //     totalcommunityRepo.remove(boardNo);

    // }

    // @Override
    // public void modify(TotalCommunity totalCommunity) throws Exception {
    //     // TODO Auto-generated method stub
    //     totalcommunityRepo.modify(totalCommunity);
    // }
    
}

