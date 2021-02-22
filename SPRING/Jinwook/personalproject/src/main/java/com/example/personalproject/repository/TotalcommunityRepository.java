package com.example.personalproject.repository;

import com.example.personalproject.entity.TotalCommunity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TotalcommunityRepository {

    private static final Logger log =
            LoggerFactory.getLogger(TotalcommunityRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<TotalCommunity> list() throws Exception {
        log.info("list()");

        List<TotalCommunity> results = jdbcTemplate.query(
            "select board_no, catalogue, title, content, writer, " +
                    "reg_date from totalcommunity where board_no > 0 " +
                    "order by board_no desc, reg_date desc",

            new RowMapper<TotalCommunity>() {
                @Override
                public TotalCommunity mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                        TotalCommunity totalcommunity = new TotalCommunity();
                        totalcommunity.setBoardNo(rs.getInt("board_no"));
                        totalcommunity.setCatalogue(rs.getString("catalogue"));
                        totalcommunity.setTitle(rs.getString("title"));
                        totalcommunity.setContent(rs.getString("content"));
                        totalcommunity.setWriter(rs.getString("writer"));
                        totalcommunity.setRegData(rs.getDate("regDate"));
                    return totalcommunity;
                }
            }
        );

        return results;
    }

    public void create(TotalCommunity totalcommunity) throws Exception {
        log.info("create()");

        String query = "insert into totalcommunity(catalogue, title, content, writer) " +
        "value(?, ?, ?, ?)";

        jdbcTemplate.update(query, totalcommunity.getCatalogue(), totalcommunity.getTitle(),
        totalcommunity.getContent(), totalcommunity.getWriter());
    }

    public TotalCommunity read(Integer boardNo) throws Exception {
        List<TotalCommunity> results = jdbcTemplate.query(
            "select board_no, catalogue, title, content, writer, reg_date " +
                    "from totalcommunity where board_no = ?",

            new RowMapper<TotalCommunity>() {
                @Override
                public TotalCommunity mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                    TotalCommunity totalcommunity = new TotalCommunity();

                    totalcommunity.setBoardNo(rs.getInt("board_no"));
                    totalcommunity.setCatalogue(rs.getString("catalogue"));
                    totalcommunity.setTitle(rs.getString("title"));
                    totalcommunity.setContent(rs.getString("content"));
                    totalcommunity.setWriter(rs.getString("writer"));
                    totalcommunity.setRegData(rs.getDate("regDate"));

                    return totalcommunity;
                }
            }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
    }
    public void remove(Integer boardNo) throws Exception{
        String query = "delete from totalcommunity where board_no =?";

        jdbcTemplate.update(query, boardNo);
    }
    public void modify(TotalCommunity totalcommunity) throws Exception{
        String query = "update totalcommunity set catalogue = ?, title = ?, content = ? " +
                "where board_no = ?";
        jdbcTemplate.update(query, totalcommunity.getCatalogue(), totalcommunity.getTitle(), totalcommunity.getContent(), totalcommunity.getBoardNo());
    }
}