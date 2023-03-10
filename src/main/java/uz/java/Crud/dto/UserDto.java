package uz.java.Crud.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Integer id;

    @NotNull(message = "First name is null")
    private String first_name;

    @NotNull(message = "Last name is null")
    private String last_name;

    @NotNull(message = "Gmail address name is null")
    @Email
    private String gmail;

}
