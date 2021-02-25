package com.example.study210217.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.study210217.entity.Community;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import lombok.extern.java.Log;

@Log
@Repository
public class CommunityRepository {

    @Autowired
    // DB와 연동하기 위함
    private JdbcTemplate jdbcTemplate;

    public List<Community> list() throws Exception {
        log.info("getList()");

        // 리스트와 같이 많은 결과가ㅄ들을 처리 할 수 있는 메소드(여러개의 로우 가ㅄ을 저장)
        List<Community> results = jdbcTemplate.query(
                "select list_no, contents, writer, reg_date, reg_date from community where list_no > 0 "
                        + "order by list_no desc, reg_date desc",

                // 필요한 정보를 전달받기 위함
                new RowMapper<Community>() {
                    @Override
                    public Community mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Community community = new Community();

                        community.setListNo(rs.getInt("list_no"));
                        community.setWriter(rs.getString("writer"));
                        community.setRegDate(rs.getDate("reg_date"));
                        community.setContents(rs.getString("contents"));

                        return community;
                    }
                });
        return results;
    }

    public void write(Community community) throws Exception {
        log.info("write()");

        KeyHolder keyHolder = new GeneratedKeyHolder();
        String query = "insert into community(writer, contents) values(?, ?)";

        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(query, new String[] { "listNo" });

                ps.setString(1, community.getWriter());
                ps.setString(2, community.getContents());

                return ps;
            }
        }, keyHolder);
        community.setListNo(keyHolder.getKey().intValue());
    }

    public Community comment(Integer listNo) throws Exception {
        log.info("comment()");

        List<Community> results = jdbcTemplate.query(
                "select list_no, contents, writer, reg_date from community where list_no = ?",
                new RowMapper<Community>() {
                    @Override
                    public Community mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Community community = new Community();

                        community.setListNo(rs.getInt("list_no"));
                        community.setContents(rs.getString("contents"));
                        community.setWriter(rs.getString("writer"));
                        community.setRegDate(rs.getDate("reg_date"));

                        return community;
                    }
                }, listNo);
        return results.isEmpty() ? null : results.get(0);
    }

    public void remove(Integer listNo) throws Exception {
        String query = "delete from community where list_no = ?";
        jdbcTemplate.update(query, listNo);
    }

    public void modify(Community community) throws Exception {
        String query = "update community set contents = ? " + "where list_no = ?";
        jdbcTemplate.update(query, community.getContents(), community.getListNo());
    }

}
