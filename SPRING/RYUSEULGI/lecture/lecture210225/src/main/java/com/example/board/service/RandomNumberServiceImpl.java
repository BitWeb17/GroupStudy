package com.example.board.service;

import com.example.board.entity.RandomNumber;
import com.example.board.repository.RandomNumberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomNumberServiceImpl implements RandomNumberService {

    @Autowired
    private RandomNumberRepository randNumRepo;

    @Override
    public RandomNumber getRandom() {
        return randNumRepo.getRandom();
    }
}
