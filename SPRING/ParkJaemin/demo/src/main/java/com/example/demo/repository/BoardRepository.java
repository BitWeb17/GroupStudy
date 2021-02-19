
package com.example.demo.repository;
import com.example.demo.controller.board.BoardController;
import com.example.demo.entity.Board;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class BoardRepository {
    private static final Logger log =
            LoggerFactory.getLogger(BoardController.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Board> list() throws Exception {
        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, " +
                        "reg_date from board where board_no > 0 " +
                        "order by board_no desc, reg_date desc ",
                //5개의 정보를 보드에서 가져온다 보드넘버는 0보다 크다 // 오더 바이 순서 조정 낮은녀석이 앞에 오고 큰놈이 뒤에 온다.

                new RowMapper<Board>() {
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Board board = new Board(); // db에서 셀렉한 개체들을 객체 보드에 담는다.
                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setRegDate(rs.getDate("reg_date"));
                        return board;
                    }
                }
        );
        return results;
    }
    public void create(Board board) throws Exception {
        log.info("create()");
        /* values(?, ?, ?) 은 insert into board(title, content, writer)
           값을 받는다. */
        // alter table board convert to charset utf8;
        // 한글 처리 안 될 경우
        String query = "insert into board(title, content, writer) " +
                "values(?, ?, ?)";// 원하는 값을 받을 수 있음(타이틀, 콘텐트, 라이터)
        jdbcTemplate.update(query, board.getTitle(),
                board.getContent(), board.getWriter());
    }
    public Board read(Integer boardNo) throws Exception {
        List<Board> results = jdbcTemplate.query(
                "select board_no, title, content, writer, reg_date " +
                        "from board where board_no = ?", // 조건을 보드 넘버에서 본다
                new RowMapper<Board>() {
                    @Override
                    public Board mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Board board = new Board();
                        board.setBoardNo(rs.getInt("board_no"));
                        board.setTitle(rs.getString("title"));
                        board.setContent(rs.getString("content"));
                        board.setWriter(rs.getString("writer"));
                        board.setRegDate(rs.getDate("reg_date"));
                        return board;
                    }
                }, boardNo
        );
        return results.isEmpty() ? null : results.get(0);
    }
}



// 조건을 보드 넘버에서 본다