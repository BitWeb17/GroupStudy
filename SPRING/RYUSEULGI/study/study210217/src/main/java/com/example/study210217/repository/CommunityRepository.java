package com.example.study210217.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.study210217.entity.Community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CommunityRepository {
    private static final Logger log = LoggerFactory.getLogger(CommunityRepository.class);

    @Autowired
    // DB와 연동하기 위함
    private JdbcTemplate jdbcTemplate;

    public List<Community> list() throws Exception {
        log.info("getList()");

        // 리스트와 같이 많은 결과가ㅄ들을 처리 할 수 있는 메소드(여러개의 로우 가ㅄ을 저장)
        List<Community> results = jdbcTemplate.query(
                // SQL에 만들어준 table과 일치하게 하기
                // select 데이터 조회
                "select board_no, title, content, writer, " + "reg_date from board where board_no > 0 "
                // order by 정렬순서
                        + "order by board_no desc, reg_date desc",

                // 필요한 정보를 전달받기 위함
                new RowMapper<Community>() {
                    @Override
                    public Community mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Community community = new Community();
                        community.setListNo(rs.getInt("board_no"));
                        community.setWriter(rs.getString("writer"));
                        community.setDate(rs.getDate("reg_date"));
                        community.setContents(rs.getString("content"));

                        return community;
                    }
                });
        return results;
    }

    public void write(Community community) throws Exception {
        log.info("write()");

        String query = "insert into board(title, content, writer) " + "values(?, ?, ?)";
        jdbcTemplate.update(query, community.getDate(), community.getWriter(), community.getContents());
    }

    public Community comment(Integer listNo) throws Exception {
        List<Community> results = jdbcTemplate.query(
            "select list_no, contents, writer, reg_date " +
                    "from community where list_no = ?",

            new RowMapper<Community>() {
                @Override
                public Community mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                    Community community = new Community();
                    community.setListNo(rs.getInt("list_no"));
                    community.setContents(rs.getString("contents"));
                    community.setWriter(rs.getString("writer"));
                    community.setRegDate(rs.getDate("reg_date"));

                    return community;
                }
            }, listNo
        );
        return results.isEmpty() ? null : results.get(0);
    }

    public void remove(Integer listNo) throws Exception {
        String query = "delete from community where list_no = ?";
        jdbcTemplate.update(query, listNo);
    }

    public void modify(Community community) throws Exception {
        String query = "update community set contents = ? " +
                "where list_no = ?";

        jdbcTemplate.update( query, community.getContents(), community.getListNo());
    }

}
