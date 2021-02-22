package com.example.neodemo.service;

import java.util.List;

import com.example.neodemo.entity.CommunityBoard;

public interface CommunityBoardservice {

    public List<CommunityBoard> list() throws Exception;

    public void register(CommunityBoard board) throws Exception;

    public CommunityBoard read(Integer boardNo) throws Exception;

    public void remove(Integer boardNo) throws Exception;

    public void modify(CommunityBoard board) throws Exception;
    
}
