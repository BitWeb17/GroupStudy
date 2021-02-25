package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.VueBoard;
import com.example.demo.repository.VueBoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueBoardServiceImpl implements VueBoardService {

    @Autowired
    private VueBoardRepository vBoardRepo;

    @Override
    public List<VueBoard> list() throws Exception {
        return vBoardRepo.list();
    }

    @Override
    public void register(VueBoard board) throws Exception {
        vBoardRepo.create(board);
    }

    @Override
    public VueBoard read(Long boardNo) throws Exception {
        return vBoardRepo.read(boardNo);
    }

    @Override
    public void remove(Long boardNo) throws Exception {
        vBoardRepo.delete(boardNo);
    }

    @Override
    public void modify(VueBoard board) throws Exception {
        vBoardRepo.update(board);
    }
}
