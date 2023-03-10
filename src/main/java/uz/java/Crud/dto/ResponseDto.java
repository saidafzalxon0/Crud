package uz.java.Crud.dto;

public class ResponseDto<T> {
    int code;
    String message;

    T data;
}
