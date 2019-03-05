package com.zckj.parking.http;

/**
 * Created by codeest on 2016/8/4.
 */
public class ApiException extends Exception {

    private String code;

    private int resultCode;

    public ApiException(String msg) {
        super(msg);
    }

    public ApiException(String msg, String code) {
        super(msg);
        this.code = code;
    }

    public ApiException(String msg, int resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }
}
