package com.example.personalproject.entity;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TotalCommunity {
    private int boardNo;
    private String title;
    private String writer;
    private String content;
    private Date regData;
}
