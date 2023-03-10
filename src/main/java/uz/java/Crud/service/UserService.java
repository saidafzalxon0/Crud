package uz.java.Crud.service;

import org.springframework.http.ResponseEntity;
import uz.java.Crud.dto.ResponseDto;
import uz.java.Crud.dto.UserDto;

import java.util.List;

public interface UserService {


    ResponseDto<UserDto> addUser(UserDto userDto);

    ResponseDto<UserDto> update(UserDto userDto);

    ResponseDto<UserDto> get_by_id(Integer id);

    ResponseDto<List<UserDto>> getAll();

    ResponseDto<Boolean> delete_by_id(Integer id);
}
