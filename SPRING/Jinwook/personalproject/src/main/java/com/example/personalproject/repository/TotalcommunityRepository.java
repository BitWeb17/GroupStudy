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
public class TotalCommunityRepository {

    private static final Logger log =
            LoggerFactory.getLogger(TotalCommunityRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<TotalCommunity> list() throws Exception {
        log.info("list()");

        List<TotalCommunity> results = jdbcTemplate.query(
            "select board_no, catalogue, title, content, writer, " +
                    "reg_date from totalCommunity where board_no > 0 " +
                    "order by board_no desc, reg_date desc",

            new RowMapper<TotalCommunity>() {
                @Override
                public TotalCommunity mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                        TotalCommunity totalCommunity = new TotalCommunity();
                        totalCommunity.setBoardNo(rs.getInt("board_no"));
                        totalCommunity.setCatalogue(rs.getString("catalogue"));
                        totalCommunity.setTitle(rs.getString("title"));
                        totalCommunity.setContent(rs.getString("content"));
                        totalCommunity.setWriter(rs.getString("writer"));
                        totalCommunity.setRegDate(rs.getDate("regDate"));
                    return totalCommunity;
                }
            }
        );

        return results;
    }

    public void create(TotalCommunity totalCommunity) throws Exception {
        log.info("create()");

        String query = "insert into totalCommunity(catalogue, title, content, writer) " +
        "value(?, ?, ?, ?)";

        jdbcTemplate.update(query, totalCommunity.getCatalogue(), totalCommunity.getTitle(),
        totalCommunity.getContent(), totalCommunity.getWriter());
    }

    public TotalCommunity read(Integer boardNo) throws Exception {
        List<TotalCommunity> results = jdbcTemplate.query(
            "select board_no, catalogue, title, content, writer, reg_date " +
                    "from totalCommunity where board_no = ?",

            new RowMapper<TotalCommunity>() {
                @Override
                public TotalCommunity mapRow(ResultSet rs, int rowNum)
                        throws SQLException {

                    TotalCommunity totalCommunity = new TotalCommunity();

                    totalCommunity.setBoardNo(rs.getInt("board_no"));
                    totalCommunity.setCatalogue(rs.getString("catalogue"));
                    totalCommunity.setTitle(rs.getString("title"));
                    totalCommunity.setContent(rs.getString("content"));
                    totalCommunity.setWriter(rs.getString("writer"));
                    totalCommunity.setRegDate(rs.getDate("regDate"));

                    return totalCommunity;
                }
            }, boardNo
        );

        return results.isEmpty() ? null : results.get(0);
    }
//     public void remove(Integer boardNo) throws Exception{
//         String query = "delete from totalCommunity where board_no =?";

//         jdbcTemplate.update(query, boardNo);
//     }
//     public void modify(TotalCommunity totalCommunity) throws Exception{
//         String query = "update totalCommunity set catalogue = ?, title = ?, content = ? " +
//                 "where board_no = ?";
//         jdbcTemplate.update(query, totalCommunity.getCatalogue(), totalCommunity.getTitle(), totalCommunity.getContent(), totalCommunity.getBoardNo());
//     }
}