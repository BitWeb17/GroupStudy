package com.example.personalproject.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class TotalCommunity {
    
    private Long boardNo;
    private String catalogue;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
