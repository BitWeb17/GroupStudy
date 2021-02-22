package com.example.neodemo.service;

import java.util.List;

import com.example.neodemo.entity.CommunityBoard;
import com.example.neodemo.repository.CommunityBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityBoardServiceImpl implements CommunityBoardservice {

    @Autowired
	public CommunityBoardRepository boardRepo;

    @Override
    public List<CommunityBoard> list() throws Exception {
        return boardRepo.list();
    }

    @Override
	public void register(CommunityBoard board) throws Exception {
        board.register(this);
	}

    @Override
    public CommunityBoard read(Integer boardNo) throws Exception {
        return boardRepo.read(boardNo);
    }

    @Override
    public void remove(Integer boardNo) throws Exception {
        boardRepo.remove(boardNo);
    }

    @Override
    public void modify(CommunityBoard board) throws Exception {
        boardRepo.modify(board);
    }

   
}