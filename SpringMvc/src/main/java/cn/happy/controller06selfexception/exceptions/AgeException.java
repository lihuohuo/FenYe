package cn.happy.controller06selfexception.exceptions;

/**
 * Created by Happy on 2017-08-28.
 */
public class AgeException extends UserException {
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
