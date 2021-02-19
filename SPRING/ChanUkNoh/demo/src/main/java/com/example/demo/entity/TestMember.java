package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

// Lombok을 사용하면 Setter, Getter 적지 않아도 알아서 만들어 줌
@Setter
@Getter
public class TestMember {
    private String userName = "Enter Id";
    private String password = "Enter Password";
    private String password4Confirm = "Enter Password Again";
    private String introduction;
    private List<String> hobbyList;

    private String id4Check = "Enter Id";
    private String pw4Check = "Enter Password";
}
