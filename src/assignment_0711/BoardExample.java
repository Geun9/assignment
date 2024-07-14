package assignment_0711;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BoardExample {

    private static final String MENU_NUMBER = "[1-4]+";
    private static final String SUB_MENU_NUMBER = "[1-2]+";
    private static final String READ_SUB_MENU_NUMBER = "[1-3]+";
    private static boolean isQuit = false;
    private static List<Board> boardList = new ArrayList<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BoardExample boardExample = new BoardExample();
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
        list();
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.println(BoardText.MAIN_MENU.getText());
    }

    private static void list() {
        Collections.sort(boardList, new Comparator<Board>() {
            @Override
            public int compare(Board b1, Board b2) {
                return String.valueOf(b1.getBno()).compareTo(String.valueOf(b2.getBno())) * (-1);
            }
        });

        for (Board board : boardList) {
            System.out.println(board.toString());
        }
    }

    /*
     * 메뉴 입력 받기
     * 입력 받은 번호의 기능 실행
     */
    private static void mainMenu() throws IOException {
        System.out.print(BoardText.MENU_SELECT.getText());
        String inputMenuSelect = br.readLine();
        if (inputMenuSelect.matches(MENU_NUMBER)) {
            switch (Integer.parseInt(inputMenuSelect)) {
                case 1 -> create();
                case 2 -> read();
                case 3 -> clear();
                case 4 -> exit();
            }
        } else {
            System.out.println("\n없는 메뉴 번호입니다.\n다시 입력해주세요.\n");
        }
    }

    /*
     * 게시글 생성
     */
    private static void create() throws IOException {
        System.out.println(BoardText.CREATE_BOARD.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = br.readLine();
        System.out.print(BoardText.CONTENT.getText());
        String content = br.readLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = br.readLine();

        /*
         * 게시글 생성 확인
         */
        printSubMenu();
        String inputSubMenu = br.readLine();
        if (inputSubMenu.matches(SUB_MENU_NUMBER)) {
            if (Integer.parseInt(inputSubMenu) == 1) {
                boardList.add(new Board(title, content, writer));
            }
        }
    }

    /*
     * 게시글 읽기
     */
    private static void read() throws IOException{
        System.out.println(BoardText.READ_BOARD.getText());
        System.out.print(BoardText.BNO.getText());

        int inputBno = Integer.parseInt(br.readLine());
        for (Board board : boardList) {
            if (board.getBno() == inputBno) {
                System.out.println(BoardText.BOARD_SEPARATOR.getText());
                System.out.println(BoardText.NO.getText() + board.getBno());
                System.out.println(BoardText.TITLE.getText() + board.getBtitle());
                System.out.println(BoardText.CONTENT.getText() + board.getBcontent());
                System.out.println(BoardText.WRITER.getText() + board.getBwriter());
                System.out.println(BoardText.DATE.getText() + board.getDate());
                System.out.println(BoardText.BOARD_SEPARATOR.getText());
                readSubMenu(board);
                break;
            }
        }
    }

    /*
     * 게시글 읽기 > 수정/삭제/목록 보기
     */
    private static void readSubMenu(Board board) throws IOException {
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.println(BoardText.READ_SUB_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());

        String inputSubMenu = br.readLine();
        if (inputSubMenu.matches(READ_SUB_MENU_NUMBER)) {
            switch (Integer.parseInt(inputSubMenu)) {
                case 1 -> update(board);
                case 2 -> delete(board);
            }
        }
    }

    /*
     * 게시글 수정
     */
    private static void update(Board board) throws IOException{
        System.out.println(BoardText.UPDATE_BOARD.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = br.readLine();
        System.out.print(BoardText.CONTENT.getText());
        String content = br.readLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = br.readLine();

        /*
         * 게시글 수정 확인
         */
        printSubMenu();
        String inputSubMenu = br.readLine();
        if (inputSubMenu.matches(SUB_MENU_NUMBER)) {
            if (Integer.parseInt(inputSubMenu) == 1) {
                board.setBtitle(title);
                board.setBcontent(content);
                board.setBwriter(writer);
            }
        }
    }

    private static void delete(Board board) {
        boardList.remove(board);
    }

    private static void clear() {

    }

    private static void exit() {
        isQuit = !isQuit;
    }

    private static void printSubMenu() {
        System.out.println(BoardText.BORDER_LINE.getText());
        System.out.println(BoardText.SUB_MENU.getText());
        System.out.print(BoardText.MENU_SELECT.getText());
    }
}
