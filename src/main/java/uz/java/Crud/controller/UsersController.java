package uz.java.Crud.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.java.Crud.dto.ResponseDto;
import uz.java.Crud.dto.UserDto;
import uz.java.Crud.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public record UsersController(UserService userService) {

    @PostMapping("/add")
    public ResponseDto<UserDto> addUser(@Valid @RequestBody UserDto userDto){
          return userService.addUser(userDto);
    }

    public ResponseDto<UserDto> update(@Valid @RequestBody UserDto userDto){
        return userService.update(userDto);
    }

    public ResponseDto<UserDto> get_by_id(@Valid @RequestParam("id") Integer id){
        return userService.get_by_id(id);
    }

    public ResponseDto<List<UserDto>> getAll(){
        return userService.getAll();
    }

    public ResponseDto<Boolean> delete_by_id(@Valid @RequestParam("id") Integer id){
        return userService.delete_by_id(id);
    }

}
