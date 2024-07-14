package assignment_0711;

public enum BoardText {
    HEADER("\n[게시글 목록]"),
    BORDER_TYPE("no\t\t\twriter\t\t\tdate\t\t\t\t\t\ttitle"),
    MAIN_MENU("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit"),
    MENU_SELECT("메뉴 선택: "),
    CREATE_BOARD("\n[새 게시글 입력]"),
    READ_BOARD("\n[게시글 읽기]"),
    UPDATE_BOARD("\n[수정 내용 입력]"),
    CLEAR_BOARD("\n[게시글 전체 삭제]"),
    EXIT_PROGRAM("** 게시글 종료 **"),
    NO("번호: "),
    TITLE("제목: "),
    CONTENT("내용: "),
    WRITER("작성자: "),
    DATE("날짜: "),
    SUB_MENU("보조 메뉴: 1. Ok | 2. Cancel"),
    READ_SUB_MENU("보조 메뉴: 1. Update | 2. Delete | 3. List"),
    BORDER_LINE("------------------------------------------------------------"),
    BOARD_SEPARATOR("############################################################");




    private final String text;

    BoardText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
