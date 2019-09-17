package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(ArithmeticException.class)
    public String arithmetic(Exception e){
        System.out.println("程序出现异常：" + e);
        return "error/arithmetic";
    }

    @ExceptionHandler(NullPointerException.class)
    public String nullPointer(Exception e){
        System.out.println("程序出现异常：" + e);
        return "error/nullpointer";
    }


    @ExceptionHandler(java.lang.Exception.class)
    public String exception(Exception e){
        System.out.println("程序出现异常：" + e);
        return "error/exception";
    }
}
