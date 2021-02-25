package com.example.board.repository;

import com.example.board.entity.RandomNumber;

import org.springframework.stereotype.Repository;

@Repository
public class RandomNumberRepository {
    public RandomNumber getRandom() {
        return new RandomNumber();
    }
}
