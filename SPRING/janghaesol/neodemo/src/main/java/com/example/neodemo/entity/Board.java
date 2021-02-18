package com.example.neodemo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import com.example.neodemo.service.NeoCommunitylmpl;

@Setter
@Getter
public class Board {
    public void register(NeoCommunitylmpl neoCommunitylmpl) throws Exception {
	    neoCommunitylmpl.boardRepo.create(this);
	}
	private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}