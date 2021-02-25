package com.example.demo.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class VueBoard {
    private long boardNo;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
}
