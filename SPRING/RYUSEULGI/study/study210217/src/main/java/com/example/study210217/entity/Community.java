package com.example.study210217.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Community {
    private int listNo;
    private String contents;
    private String writer;
    private Date date;
}
