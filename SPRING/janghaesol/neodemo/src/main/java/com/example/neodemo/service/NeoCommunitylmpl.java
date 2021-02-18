package com.example.neodemo.service;

import com.example.neodemo.entity.Board;
import com.example.neodemo.repository.NeoCommuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeoCommunitylmpl implements NeoCommunity {

    @Autowired
	public NeoCommuRepository boardRepo;

    @Override
    public List<Board> list() throws Exception {
        return boardRepo.list();
    }

    @Override
	public void register(Board board) throws Exception {
		board.register(this);
	}

    @Override
    public Board read(Integer boardNo) throws Exception {
        return boardRepo.read(boardNo);
    }

    @Override
    public void remove(Integer boardNo) throws Exception {

    }

    @Override
    public void modify(Board board) throws Exception {

    }
}