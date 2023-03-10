package uz.java.Crud.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResponseDto<T> {
    int code;
    String message;
    T data;
}
