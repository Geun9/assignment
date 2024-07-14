package assignment_0711;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BoardExample {

    private static final String MENU_NUMBER = "[1-4]+";
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
        for (Board board : boardList) {
            System.out.println(board.toString());
        }
    }

    private static void mainMenu() throws IOException {
        System.out.print(BoardText.MENU_SELECT.getText());
        String inputMenuSelect = br.readLine();
        if (inputMenuSelect.matches(MENU_NUMBER)) {
            switch (Integer.parseInt(inputMenuSelect)) {
                case 1 -> createBoard();
                case 2 -> readBoard();
                case 3 -> clearBoard();
                case 4 -> exitProgram();
            }
        } else {
            System.out.println("\n없는 메뉴 번호입니다.\n다시 입력해주세요.\n");
        }
    }

    private static void createBoard() throws IOException {
        System.out.println(BoardText.CREATE_BOARD.getText());
        System.out.print(BoardText.TITLE.getText());
        String title = br.readLine();
        System.out.print(BoardText.CONTENT.getText());
        String content = br.readLine();
        System.out.print(BoardText.WRITER.getText());
        String writer = br.readLine();

        boardList.add(new Board(title, content, writer));
    }

    private static void readBoard() {

    }

    private static void clearBoard() {

    }

    private static void exitProgram() {
        isQuit = !isQuit;
    }

    private static String getDate() {
        LocalDate now = LocalDate.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        return simpleDateFormat.format(now);
    }
}
