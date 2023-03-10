package uz.java.Crud.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.java.Crud.dto.ResponseDto;
import uz.java.Crud.dto.UserDto;
import uz.java.Crud.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseDto<UserDto> addUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseDto<UserDto> update(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseDto<UserDto> get_by_id(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<List<UserDto>> getAll() {
        return null;
    }

    @Override
    public ResponseDto<Boolean> delete_by_id(Integer id) {
        return null;
    }
}
