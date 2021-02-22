package com.example.personalproject.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TotalCommunity {
    
    private int boardNo;
    private String catalogue;
    private String title;
    private String content;
    private String writer;
    private Date regData;
}
