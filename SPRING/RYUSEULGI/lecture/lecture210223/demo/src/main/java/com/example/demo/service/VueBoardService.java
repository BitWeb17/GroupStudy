package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.VueBoard;

public interface VueBoardService {
    public List<VueBoard> list() throws Exception;

    public void register(VueBoard board) throws Exception;

    public VueBoard read(Long boardNo) throws Exception;

    public void remove(Long boardNo) throws Exception;

    public void modify(VueBoard board) throws Exception;
}
