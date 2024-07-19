package assignment_0711.common;

public enum ErrorCode {
    INVALID_MENU_OPTION("유효하지 않은 메뉴 번호입니다. 다시 입력해 주세요."),
    NON_EXISTENT_BOARD_ID("해당 게시글 번호가 존재하지 않습니다. 다시 입력해 주세요."),
    NULL_BOARD_INPUT("입력값이 비어 있습니다. 값을 입력해 주세요."),
    TITLE_STRING_TOO_LONG("제목이 너무 깁니다. 최대 25자 이하로 입력해 주세요."),
    AUTHOR_STRING_TOO_LONG("작성자 이름이 너무 깁니다. 최대 10자 이하로 입력해 주세요."),
    INVALID_PRODUCT_ID("상품 번호는 숫자로 입력해 주세요.");



    private String message;

    private ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
