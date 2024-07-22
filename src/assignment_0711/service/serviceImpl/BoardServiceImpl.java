package assignment_0711.service.serviceImpl;

import assignment_0711.common.BoardText;
import assignment_0711.common.ErrorCode;
import assignment_0711.common.ValidCheck;
import assignment_0711.dao.BoardDao;
import assignment_0711.dto.Board;
import assignment_0711.exception.BoardException;
import assignment_0711.service.BoardService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BoardServiceImpl implements BoardService {
    private static final int SUB_MENU_OK = 1;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BoardDao boardDao = new BoardDao();
    private static ValidCheck validCheck = new ValidCheck();

    @Override
    public void list() {
        List<Board> list = boardDao.list();

        for (Board board : list) {
            System.out.println(board.toString());
        }

    }

    /**
     * 게시글 생성
     */
    @Override
    public void insertBoard() {
        try {
            System.out.print(BoardText.TITLE.getText());
            String title = br.readLine();
            validCheck.isTitleLengthValid(title);
            System.out.print(BoardText.CONTENT.getText());
            String content = br.readLine();
            System.out.print(BoardText.WRITER.getText());
            String writer = br.readLine();
            validCheck.isWriterLengthValid(writer);

            Board board = new Board(title, content, writer);
            validCheck.isBoardValid(board);

            int inputSubMenu = subMenu();
            if (inputSubMenu == SUB_MENU_OK) {
                boardDao.insertBoard(board);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BoardException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 게시글 읽기
     */
    @Override
    public void getBoard() {
        try {
            System.out.println(BoardText.READ_BOARD.getText());
            System.out.print(BoardText.BNO.getText());

            int inputBno = Integer.parseInt(br.readLine().trim());

            Board board = boardDao.getBoard(inputBno);

            if (board.getBno() == inputBno) {
                System.out.println(BoardText.BOARD_SEPARATOR.getText());
                System.out.println(BoardText.NO.getText() + board.getBno());
                System.out.println(BoardText.TITLE.getText() + board.getBtitle());
                System.out.println(BoardText.CONTENT.getText() + board.getBcontent());
                System.out.println(BoardText.WRITER.getText() + board.getBwriter());
                System.out.println(BoardText.DATE.getText() + board.getBdate());
                System.out.println(BoardText.BOARD_SEPARATOR.getText());

                readSubMenu(board);
            } else {
                throw new BoardException(ErrorCode.NON_EXISTENT_BOARD_ID);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BoardException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            throw new BoardException(ErrorCode.INVALID_PRODUCT_ID);
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

            String inputSubMenu = br.readLine().trim();
            validCheck.isReadSubMenuValid(inputSubMenu);

            switch (Integer.parseInt(inputSubMenu)) {
                case 1 -> updateBoard(board);
                case 2 -> deleteBoard(board);
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
            validCheck.isTitleLengthValid(title);
            System.out.print(BoardText.CONTENT.getText());
            String content = br.readLine();
            System.out.print(BoardText.WRITER.getText());
            String writer = br.readLine();
            validCheck.isWriterLengthValid(writer);

            Board updateBoard = new Board(title, content, writer);
            validCheck.isBoardValid(updateBoard);

            int inputSubMenu = subMenu();

            if (inputSubMenu == SUB_MENU_OK) {
                boardDao.updateBoard(board, updateBoard);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BoardException e) {
            System.out.println(e.getMessage());
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
    @Override
    public void clearBoard() {
        try {
            System.out.println(BoardText.CLEAR_BOARD.getText());

            int inputSubMenu = subMenu();
            if (inputSubMenu == SUB_MENU_OK) {
                boardDao.clearBoard();
            }
        } catch (BoardException e) {
            System.out.println(e.getMessage());
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

            String inputSubMenu = br.readLine().trim();
            validCheck.isSubMenuValid(inputSubMenu);

            return Integer.parseInt(inputSubMenu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
