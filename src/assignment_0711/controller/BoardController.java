package assignment_0711.controller;

import assignment_0711.common.BoardText;
import assignment_0711.service.BoardService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardController {

    private static final String MENU_NUMBER = "^[1-4]";
    private static boolean isQuit = false;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BoardService boardService = new BoardService();

    public static void main(String[] args) throws IOException {
        while (!isQuit) {
            displayMenuList();
            mainMenu();
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
    private static void mainMenu() throws IOException {
        System.out.print(BoardText.MENU_SELECT.getText());
        String inputMenuSelect = br.readLine();
        if (inputMenuSelect.matches(MENU_NUMBER)) {
            switch (Integer.parseInt(inputMenuSelect)) {
                case 1 -> boardService.insertBoard();
                case 2 -> boardService.getBoard();
                case 3 -> boardService.clearBoard();
                case 4 -> exit();
            }
        } else {
            System.out.println("\n없는 메뉴 번호입니다.\n다시 입력해주세요.\n");
        }
    }

    /**
     * 프로그램 종료
     */
    private static void exit() {
        isQuit = !isQuit;
    }

}

