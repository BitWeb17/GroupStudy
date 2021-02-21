// package com.example.personalproject.repository.loginrepositoy;

// import com.example.personalproject.entity.TotalCommunity;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.RowMapper;
// import org.springframework.stereotype.Repository;

// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.util.List;

// @Repository
// public class LoginRepo {

//     private static final Logger log =
//             LoggerFactory.getLogger(LoginRepo.class);

//     @Autowired
//     private JdbcTemplate jdbcTemplate;

//     public List<TotalCommunity> totallist() throws Exception {
//         log.info("list()");

//         List<TotalCommunity> results = jdbcTemplate.query(
//             "select board_no, title, content, writer, " +
//                     "reg_date from board where board_no > 0 " +
//                     "order by board_no desc, reg_date desc",

//             new RowMapper<TotalCommunity>() {
//                 @Override
//                 public TotalCommunity mapRow(ResultSet rs, int rowNum)
//                         throws SQLException {

//                         TotalCommunity totalcommunity = new TotalCommunity();
//                         totalcommunity.setBoardNo(rs.getInt("board_no"));
//                         totalcommunity.setTitle(rs.getString("title"));
//                         totalcommunity.setContent(rs.getString("content"));
//                         totalcommunity.setWriter(rs.getString("writer"));
//                         totalcommunity.setRegData(rs.getDate("regDate"));

//                     return totalcommunity;
//                 }
//             }
//         );

//         return results;
//     }

//     public void create(TotalCommunity totalcommunity) throws Exception {
//         log.info("create()");

//         // alter table board convert to charset utf8;
//         // 한글 처리 안 될 경우
//         String query = "insert into board(title, content, writer) " +
//                 "values(?, ?, ?)";

//         jdbcTemplate.update(query, totalcommunity.getTitle(),
//         totalcommunity.getContent(), totalcommunity.getWriter());
//     }

//     public TotalCommunity read(Integer boardNo) throws Exception {
//         List<TotalCommunity> results = jdbcTemplate.query(
//             "select board_no, title, content, writer, reg_date " +
//                     "from board where board_no = ?",

//             new RowMapper<TotalCommunity>() {
//                 @Override
//                 public TotalCommunity mapRow(ResultSet rs, int rowNum)
//                         throws SQLException {

//                     TotalCommunity totalcommunity = new TotalCommunity();
//                     totalcommunity.setBoardNo(rs.getInt("board_no"));
//                     totalcommunity.setTitle(rs.getString("title"));
//                     totalcommunity.setContent(rs.getString("content"));
//                     totalcommunity.setWriter(rs.getString("writer"));
//                     totalcommunity.setRegData(rs.getDate("regDate"));

//                     return totalcommunity;
//                 }
//             }, boardNo
//         );

//         return results.isEmpty() ? null : results.get(0);
//     }
// }