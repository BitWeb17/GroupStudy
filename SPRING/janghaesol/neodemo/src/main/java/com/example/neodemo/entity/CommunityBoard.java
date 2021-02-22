package com.example.neodemo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import com.example.neodemo.service.CommunityBoardServiceImpl;
@Getter
@Setter
public class CommunityBoard {
    public void register(CommunityBoardServiceImpl boardServiceImpl) throws Exception{
        boardServiceImpl.boardRepo.create(this);
    }
    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private int viewCnt;
    
    public int getViewCnt(){
        return viewCnt;
    }
    public void setViewCnt(int viewCnt){
        this.viewCnt = viewCnt;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
