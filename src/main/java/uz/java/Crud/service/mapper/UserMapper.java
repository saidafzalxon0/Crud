package uz.java.Crud.service.mapper;

import org.mapstruct.Mapper;
import uz.java.Crud.dto.UserDto;
import uz.java.Crud.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
