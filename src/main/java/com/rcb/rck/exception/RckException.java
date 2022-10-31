package com.rcb.rck.exception;


/*
 *
 * @param null
 * @return
 * @author shanjiaxiang
 */
public class RckException extends RuntimeException {
    private final Integer code;
    private final String message;

    public RckException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public RckException(RckExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
