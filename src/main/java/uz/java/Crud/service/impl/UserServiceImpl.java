package uz.java.Crud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.java.Crud.dto.ResponseDto;
import uz.java.Crud.dto.UserDto;
import uz.java.Crud.entity.User;
import uz.java.Crud.repository.UserRepository;
import uz.java.Crud.service.UserService;
import uz.java.Crud.service.mapper.UserMapper;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;
    @Override
    public ResponseDto<UserDto> addUser(UserDto userDto) {
        if(userRepository.findFirstByGmail(userDto.getGmail()).isEmpty()){
            return ResponseDto.<UserDto>builder()
                    .code(0)
                    .data(userMapper.toDto(userRepository.save(userMapper.toEntity(userDto))))
                    .message("Success add user").build();
        }
            return ResponseDto.<UserDto>builder()
                    .code(-1)
                    .message("This user already exists")
                    .build();
    }

    @Override
    public ResponseDto<UserDto> update(UserDto userDto) {
        if(userRepository.findFirstById(userDto.getId()).isPresent()){
            return ResponseDto.<UserDto>builder()
                    .code(0)
                    .data(userMapper.toDto(userRepository.save(userMapper.toEntity(userDto))))
                    .message("Success update user").build();
        }
        return ResponseDto.<UserDto>builder()
                .code(-1)
                .message("No such user")
                .build();
    }

    @Override
    public ResponseDto<UserDto> get_by_id(Integer id) {
        Optional<User> optional = userRepository.findFirstById(id);
        if(optional.isPresent()){
            return ResponseDto.<UserDto>builder()
                    .code(0)
                    .data(userMapper.toDto(optional.get()))
                    .message("Success").build();
        }
        return ResponseDto.<UserDto>builder()
                .code(-1)
                .message("No such user")
                .build();
    }

    @Override
    public ResponseDto<List<UserDto>> getAll() {
        return ResponseDto.<List<UserDto>>builder()
                .message("Success")
                .code(0)
                .data(userRepository.findAll().stream().map(userMapper::toDto).toList())
                .build();
    }

    @Override
    public ResponseDto<Boolean> delete_by_id(Integer id) {
        if(userRepository.findFirstById(id).isPresent()){
            userRepository.deleteById(id);
            return ResponseDto.<Boolean>builder()
                    .code(0)
                    .message("Success").build();
        }
        return ResponseDto.<Boolean>builder()
                .code(-1)
                .message("No such user this id")
                .build();
    }
}
