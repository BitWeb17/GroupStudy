package com.example.study210217.service;

import com.example.study210217.entity.Community;

import java.util.List;

// 커뮤니티 게시판에 있어햐 하는 항목들 --> 인터페이스사용
public interface CommunityService {

    // 게시판을 리스트형식으로 관리하기
    public List<Community> list() throws Exception;

    public void write(Community community) throws Exception;

    public void remove(Integer listNo) throws Exception;

    public void modify(Community community) throws Exception;

    public void comment(Integer listNo) throws Exception;
}
