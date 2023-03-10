package uz.java.Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.java.Crud.dto.ResponseDto;
import uz.java.Crud.dto.UserDto;
import uz.java.Crud.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseDto<UserDto> addUser(@RequestBody UserDto userDto){
          return userService.addUser(userDto);
    }
    @PutMapping("/update")
    public ResponseDto<UserDto> update(@RequestBody UserDto userDto){
        return userService.update(userDto);
    }
    @GetMapping("/getById")
    public ResponseDto<UserDto> get_by_id(@RequestParam("id") Integer id){
        return userService.get_by_id(id);
    }
    @GetMapping("/getAll")
    public ResponseDto<List<UserDto>> getAll(){
        return userService.getAll();
    }
    @DeleteMapping("/delete")
    public ResponseDto<Boolean> delete_by_id(@RequestParam("id") Integer id){
        return userService.delete_by_id(id);
    }

}
