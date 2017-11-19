package cn.happy.controller06selfexception.exceptions;

/**
 * Created by Happy on 2017-08-28.
 */
public class NameException extends UserException {
    public NameException() {
    }

    public NameException(String message) {
        super(message);
    }
}
