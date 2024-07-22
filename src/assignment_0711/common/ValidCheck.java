package assignment_0711.common;

import assignment_0711.dto.Board;
import assignment_0711.exception.BoardException;

public class ValidCheck {

    private static final int MAX_TITLE_LENGTH = 25;
    private static final int MAX_WRITER_LENGTH = 10;
    private static final String SUB_MENU_NUMBER = "^[1-2]";
    private static final String READ_SUB_MENU_NUMBER = "^[1-3]";

    /**
     * 게시글 제목의 길이 체크 (25 이하)
     * @param title
     */
    public void isTitleLengthValid(String title) {
        if (title.length() > MAX_TITLE_LENGTH) {
            throw new BoardException(ErrorCode.TITLE_STRING_TOO_LONG);
        }
    }

    /**
     * 게시글 작성자의 길이 체크 (10 이하)
     * @param writer
     */
    public void isWriterLengthValid(String writer) {
        if (writer.length() > MAX_WRITER_LENGTH) {
            throw new BoardException(ErrorCode.WRITER_STRING_TOO_LONG);
        }
    }

    /**
     * 게시글 제목, 내용, 작성자 빈 값 체크
     * @param board
     */
    public void isBoardValid(Board board) {
        if (board.getBtitle().isEmpty() || board.getBcontent().isEmpty() || board.getBwriter().isEmpty()) {
            throw new BoardException(ErrorCode.NULL_BOARD_INPUT);
        }
    }

    /**
     * 보조 메뉴 유효성 검사
     * 보조 메뉴: 1. Ok | 2. Cancel
     * @param subMenu
     */
    public void isSubMenuValid(String subMenu) {
        if (!(subMenu.matches(SUB_MENU_NUMBER))) {
            throw new BoardException(ErrorCode.INVALID_MENU_OPTION);
        }
    }

    /**
     * 게시글 읽기 > 보조 메뉴 유효성 검사
     * 보조 메뉴: 1. Update | 2. Delete | 3. List
     * @param subMenu
     */
    public void isReadSubMenuValid(String subMenu) {
        if (!(subMenu.matches(READ_SUB_MENU_NUMBER))) {
            throw new BoardException(ErrorCode.INVALID_MENU_OPTION);
        }
    }
}
