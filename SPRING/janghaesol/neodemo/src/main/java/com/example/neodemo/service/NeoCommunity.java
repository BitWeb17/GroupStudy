package com.example.neodemo.service;

import com.example.neodemo.entity.Board;

import java.util.List;

public interface NeoCommunity {
    public List<Board> list() throws Exception;

    public void register(Board board) throws Exception;

    public Board read(Integer boardNo) throws Exception;

    public void remove(Integer boardNo) throws Exception;

    public void modify(Board board) throws Exception;
}