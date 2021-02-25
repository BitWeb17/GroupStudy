package com.example.demo.service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class BoardServiceImpl implements BoardService {



    @Autowired
    private BoardRepository repository;

    @Override
    public List<Board> list() throws Exception {
        return repository.list();
    }

    @Override
    public void register(Board board) throws Exception {
        repository.create(board);
    }



    @Override
    public Board read(Long boardNo) throws Exception {
        return repository.read(boardNo);
    }
}
