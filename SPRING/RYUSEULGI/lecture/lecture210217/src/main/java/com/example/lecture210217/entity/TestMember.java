package com.example.lecture210217.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestMember {
    private String userName = "bitweb";
    private String password = "456123";
    private String introduction;
    private List<String> hobbyList;
}
