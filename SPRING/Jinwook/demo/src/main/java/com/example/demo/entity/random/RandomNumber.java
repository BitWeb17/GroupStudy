package com.example.demo.entity.random;

import java.util.Random;

import lombok.Getter;


@Getter
public class RandomNumber {
    private Integer randNumber = new Random().nextInt(32) + 1;
}