package assignment_0711.exception;

import assignment_0711.common.ErrorCode;

public class BoardException extends RuntimeException{
    private final ErrorCode errorCode;

    public BoardException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
