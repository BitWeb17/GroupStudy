package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import com.example.demo.service.BoardServiceImpl;

@Setter
@Getter
public class Board {
    public void register(BoardServiceImpl boardServiceImpl) throws Exception {
	    boardServiceImpl.boardRepo.create(this);
	}
	private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}