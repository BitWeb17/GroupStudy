package com.example.lecture210205.controller;

public class Dice {

    int diceNum;

    public void random() {
        diceNum = (int) (Math.random() * 6) + 1;
        System.out.println("주사위번호 : " + diceNum);
    }
}