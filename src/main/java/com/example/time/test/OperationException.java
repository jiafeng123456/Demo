package com.example.time.test;

import org.apache.commons.lang3.StringUtils;

/*
 *@description:
 *@author jiafeng
 *@date 2020/4/15 0015 11:06
 */
public class OperationException extends Exception {

    /**
     * 序列化对象
     */
    private static final long serialVersionUID = -7379735002437428654L;

    /** 结果码 */
    private String error_code;

    /** 额外的异常信息 */
    private String error_msg;

    /**
     * 构造函数
     *
     * @param errorCode
     */
    public OperationException(String error_code) {
        this.error_code = error_code;
    }

    /**
     *
     * 构造函数
     *
     * @param errorCode
     * @param errorMsg
     */
    public OperationException(String error_code, String error_msg) {
        this.error_code = error_code;
        this.error_msg = error_msg;
    }


    @Override
    public String getMessage() {

        StringBuilder sb = new StringBuilder(200);
        if (super.getMessage() != null) {
            sb.append(super.getMessage());
        }
        sb.append(" 异常原因： ");

        if (StringUtils.isNotBlank(error_msg)) {
            sb.append("|").append(error_msg);
        }
        return sb.toString();
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }


    public OperationException(Exception e) {
        super(e);
        if(e instanceof  OperationException){
            this.error_no = ((OperationException)e).getError_code();
            this.error_info = ((OperationException)e).getError_msg();
        }else{
            this.error_no = "-1";
            this.error_info = e.getLocalizedMessage();
        }
    }

    private String error_no;

    private String error_info;

    public String getError_no() {
        return error_no;
    }

    public void setError_no(String error_no) {
        this.error_no = error_no;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }
}
