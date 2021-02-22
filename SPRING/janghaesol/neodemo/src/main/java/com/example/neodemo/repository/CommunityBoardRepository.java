package com.example.neodemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.neodemo.entity.CommunityBoard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CommunityBoardRepository{
    private static final Logger log =
            LoggerFactory.getLogger(CommunityBoardRepository.class);

            @Autowired
            private JdbcTemplate jdbcTemplate;

            public List<CommunityBoard> list() throws Exception {
                log.info("list()");
        
                List<CommunityBoard> results = jdbcTemplate.query(
                    "select board_no, title, content, writer, " +
                            "reg_date from communityboard where board_no > 0 " +
                            "order by board_no desc, reg_date desc",
                            new RowMapper<CommunityBoard>() {
                                @Override
                                public CommunityBoard mapRow(ResultSet rs, int rowNum)
                                        throws SQLException{
                
                                    CommunityBoard communityboard = new CommunityBoard();
                                    communityboard.setBoardNo(rs.getInt("board_no"));
                                    communityboard.setTitle(rs.getString("title"));
                                    communityboard.setContent(rs.getString("content"));
                                    communityboard.setWriter(rs.getString("writer"));
                                    communityboard.setRegDate(rs.getTimestamp("reg_date"));
                
                                    return communityboard;
                                }
                            }
                        );
                
                        return results;
                    }
                
                    public void create(CommunityBoard communityboard) throws Exception {
                        log.info("create()");
                
                        // alter table board convert to charset utf8;
                        // 한글 처리 안 될 경우
                        String query = "insert into communityboard(title, content, writer) " +
                                "values(?, ?, ?)";
                
                        jdbcTemplate.update(query, communityboard.getTitle(),
                        communityboard.getContent(), communityboard.getWriter());
                    }
                
                    public CommunityBoard read(Integer boardNo) throws Exception {
                        List<CommunityBoard> results = jdbcTemplate.query(
                            "select board_no, title, content, writer, reg_date " +
                                    "from communityboard where board_no = ?",
                
                            new RowMapper<CommunityBoard>() {
                                @Override
                                public CommunityBoard mapRow(ResultSet rs, int rowNum)
                                        throws SQLException {
                
                                    CommunityBoard communityboard = new CommunityBoard();
                                    communityboard.setBoardNo(rs.getInt("board_no"));
                                    communityboard.setTitle(rs.getString("title"));
                                    communityboard.setContent(rs.getString("content"));
                                    communityboard.setWriter(rs.getString("writer"));
                                    communityboard.setRegDate(rs.getDate("reg_date"));
                
                                    return communityboard;
                                }
                            }, boardNo
                        );
                
                        return results.isEmpty() ? null : results.get(0);
                    }
                
                    public void remove(Integer boardNo) throws Exception{
                        String query = "delete from communityboard where board_no = ?";
                
                        jdbcTemplate.update(query, boardNo);
                    }
                
                
                    public void modify(CommunityBoard communityboard) throws Exception{
                        String query = "update communityboard set title = ?, content = ?" + "where board_no = ?";
                
                        jdbcTemplate.update(query, communityboard.getTitle(), communityboard.getContent(), communityboard.getBoardNo()
                        );
                    }
                }