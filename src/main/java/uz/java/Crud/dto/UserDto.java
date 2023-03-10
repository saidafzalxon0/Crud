package uz.java.Crud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@JsonIgnoreProperties(value = "id",allowGetters = true)
public class UserDto {
    private Integer id;

    @NotNull(message = "First name is null")
    @NotEmpty(message = "First name is empty")
    private String first_name;

    @NotNull(message = "Last name is null")
    @NotEmpty(message = "Last name is empty")
    private String last_name;

    @NotNull(message = "Gmail address name is null")
    @NotEmpty(message = "Gmail address name is empty")
    private String gmail;

}
