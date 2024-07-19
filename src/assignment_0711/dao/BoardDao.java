package assignment_0711.dao;


import assignment_0711.config.ConnectionFactory;
import assignment_0711.dto.Board;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    private static Connection connection = null;
    private static ResultSet rs = null;


    /**
     * 게시글 목록 가져오기
     */
    public List<Board> list() {
        List<Board> list = new ArrayList<>();

        String query = new StringBuilder()
            .append("SELECT * ")
            .append("FROM boards").toString();

        connection = ConnectionFactory.getInstance().open();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("id"));
                board.setBtitle(rs.getString("title"));
                board.setBcontent(rs.getString("content"));
                board.setBwriter(rs.getString("writer"));
                board.setBdate(rs.getDate("createdAt"));

                list.add(board);
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return list;
    }

    /**
     * 게시글 생성
     */
    public void insertBoard(Board board) {
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("INSERT INTO boards ")
            .append("(title, content, writer)")
            .append("VALUES (?, ?, ?)").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, board.getBtitle());
            pstmt.setString(2, board.getBcontent());
            pstmt.setString(3, board.getBwriter());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }


    /**
     * 게시글 읽기
     */
    public Board getBoard(int bno) {
        Board board = new Board();
        String query = new StringBuilder()
            .append("SELECT * ")
            .append("FROM boards ")
            .append("WHERE id = ?").toString();
        connection = ConnectionFactory.getInstance().open();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, bno);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                board.setBno(rs.getInt("id"));
                board.setBtitle(rs.getString("title"));
                board.setBcontent(rs.getString("content"));
                board.setBwriter(rs.getString("writer"));
                board.setBdate(rs.getTimestamp("createdAt"));

            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return board;
    }


    /**
     * 게시글 읽기 > 해당 게시글 수정
     */
    public void updateBoard(Board board, Board updateBoard) {
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("UPDATE boards ")
            .append("SET ")
            .append("title = ?, content = ?, writer = ? ")
            .append("WHERE id = ?").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, updateBoard.getBtitle());
            pstmt.setString(2, updateBoard.getBcontent());
            pstmt.setString(3, updateBoard.getBwriter());
            pstmt.setInt(4, board.getBno());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }


    /**
     * 게시글 읽기 > 해당 게시글 삭제
     */
    public void deleteBoard(Board board) {
        connection = ConnectionFactory.getInstance().open();

        String query = new StringBuilder()
            .append("DELETE FROM boards ")
            .append("WHERE id = ?").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, board.getBno());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    /**
     * 게시글 전체 삭제
     */
    public void clearBoard() {
        connection = ConnectionFactory.getInstance().open();
        String query = new StringBuilder()
            .append("DELETE FROM boards").toString();

        try {
            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
            }
        }

    }
}
