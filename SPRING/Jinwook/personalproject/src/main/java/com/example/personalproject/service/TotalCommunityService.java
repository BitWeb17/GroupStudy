package com.example.personalproject.service;

import java.util.List;

import com.example.personalproject.entity.TotalCommunity;

public interface TotalCommunityService {
    
    public List<TotalCommunity> list() throws Exception;


    public void register(TotalCommunity totalCommunity) throws Exception;

    public TotalCommunity read(Integer boardNo) throws Exception;

    public void remove(Integer boardNo) throws Exception;

    public void modify(TotalCommunity totalCommunity) throws Exception;


}
