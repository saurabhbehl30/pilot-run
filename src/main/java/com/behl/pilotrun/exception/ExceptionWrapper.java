package com.behl.pilotrun.exception;

public class ExceptionWrapper {

    private String errorMsg;
    private int errorCode;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "ExceptionWrapper{" +
                "errorMsg='" + errorMsg + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
