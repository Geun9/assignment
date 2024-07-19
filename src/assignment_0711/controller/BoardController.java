package assignment_0711.controller;

import assignment_0711.common.BoardText;
import assignment_0711.common.ErrorCode;
import assignment_0711.exception.BoardException;
import assignment_0711.service.BoardService;
import assignment_0711.service.serviceImpl.BoardServiceImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardController {

    private static final String MENU_NUMBER = "^[1-4]";
    private static boolean isQuit = false;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BoardService boardService = new BoardServiceImpl();

    public static void main(String[] args) {
        try {
            while (!isQuit) {
                displayMenuList();
                mainMenu();
            }
        } catch (BoardException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayMenuList() {
        System.out.println(BoardText.HEADER.getText());
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.println(BoardText.BORDER_TYPE.getText());
        System.out.println(BoardText.BORDER_LINE.getText());
        boardService.list();
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.println(BoardText.MAIN_MENU.getText());
    }


    /**
     * 메뉴 입력 받기 입력 받은 번호의 기능 실행
     */
    private static void mainMenu() {
        try {
            System.out.print(BoardText.MENU_SELECT.getText());
            String inputMenuSelect = br.readLine().trim();
            if (inputMenuSelect.matches(MENU_NUMBER)) {
                switch (Integer.parseInt(inputMenuSelect)) {
                    case 1 -> boardService.insertBoard();
                    case 2 -> boardService.getBoard();
                    case 3 -> boardService.clearBoard();
                    case 4 -> exit();
                }
            } else {
                throw new BoardException(ErrorCode.INVALID_MENU_OPTION);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BoardException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 프로그램 종료
     */
    private static void exit() {
        isQuit = !isQuit;
    }

}

