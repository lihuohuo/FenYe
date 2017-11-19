package cn.happy.controller06selfexception.exceptions;

/**
 * Created by Happy on 2017-08-28.
 * UserException  编译时异常   RunTimeException 运行时异常
 */
public class UserException extends Exception {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}
