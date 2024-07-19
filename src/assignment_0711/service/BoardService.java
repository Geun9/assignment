package assignment_0711.service;

import assignment_0711.common.BoardText;
import assignment_0711.dao.BoardDao;
import assignment_0711.dto.Board;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BoardService {

    private static final String SUB_MENU_NUMBER = "^[1-2]";
    private static final String READ_SUB_MENU_NUMBER = "^[1-3]";
    private static final int SUB_MENU_OK = 1;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BoardDao boardDao = new BoardDao();

    public void list() {
            List<Board> list = boardDao.list();

            for (Board board : list) {
                System.out.println(board.toString());
            }

    }

    /**
     * 게시글 생성
     */
    public void insertBoard() {
        try {
            System.out.print(BoardText.TITLE.getText());
            String title = br.readLine();
            System.out.print(BoardText.CONTENT.getText());
            String content = br.readLine();
            System.out.print(BoardText.WRITER.getText());
            String writer = br.readLine();

            Board board = new Board(title, content, writer);

            int inputSubMenu = subMenu();
            if (inputSubMenu == SUB_MENU_OK) {
                boardDao.insertBoard(board);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 게시글 읽기
     */
    public void getBoard() {
        try {
            System.out.println(BoardText.READ_BOARD.getText());
            System.out.print(BoardText.BNO.getText());

            int inputBno = Integer.parseInt(br.readLine());

            Board board = boardDao.getBoard(inputBno);

            System.out.println(BoardText.BOARD_SEPARATOR.getText());
            System.out.println(BoardText.NO.getText() + board.getBno());
            System.out.println(BoardText.TITLE.getText() + board.getBtitle());
            System.out.println(BoardText.CONTENT.getText() + board.getBcontent());
            System.out.println(BoardText.WRITER.getText() + board.getBwriter());
            System.out.println(BoardText.DATE.getText() + board.getBdate());
            System.out.println(BoardText.BOARD_SEPARATOR.getText());

            readSubMenu(board);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 게시글 읽기 > 수정/삭제/목록 보기
     */
    private static void readSubMenu(Board board) {
        try {
            System.out.println(BoardText.BORDER_LINE.getText());
            System.out.println(BoardText.READ_SUB_MENU.getText());
            System.out.print(BoardText.MENU_SELECT.getText());

            String inputSubMenu = br.readLine();
            if (inputSubMenu.matches(READ_SUB_MENU_NUMBER)) {
                switch (Integer.parseInt(inputSubMenu)) {
                    case 1 -> updateBoard(board);
                    case 2 -> deleteBoard(board);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 게시글 읽기 > 해당 게시글 수정
     */
    private static void updateBoard(Board board) {

        try {
            System.out.println(BoardText.UPDATE_BOARD.getText());
            System.out.print(BoardText.TITLE.getText());
            String title = br.readLine();
            System.out.print(BoardText.CONTENT.getText());
            String content = br.readLine();
            System.out.print(BoardText.WRITER.getText());
            String writer = br.readLine();

            Board updateBoard = new Board(title, content, writer);

            int inputSubMenu = subMenu();
            if (inputSubMenu == SUB_MENU_OK) {
                boardDao.updateBoard(board, updateBoard);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 게시글 읽기 > 해당 게시글 삭제
     */
    private static void deleteBoard(Board board) {
        boardDao.deleteBoard(board);
    }

    /**
     * 게시글 전체 삭제
     */
    public void clearBoard() {
        System.out.println(BoardText.CLEAR_BOARD.getText());

        int inputSubMenu = subMenu();
        if (inputSubMenu == SUB_MENU_OK) {
            boardDao.clearBoard();
        }
    }

    /**
     * 보조 메뉴 (생성/수정/삭제 확인용)
     */
    private static int subMenu() {
        try {
            System.out.println(BoardText.BORDER_LINE.getText());
            System.out.println(BoardText.SUB_MENU.getText());
            System.out.print(BoardText.MENU_SELECT.getText());

            String inputSubMenu = br.readLine();
            if (inputSubMenu.matches(SUB_MENU_NUMBER)) {
                return Integer.parseInt(inputSubMenu);
            } else {
                return 0;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
