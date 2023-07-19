package com.geekster.userManagementSystem.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull
    private Integer userId;

    @NotBlank(message = "name cannot be blank")
    private String userName;

    @Size(min = 7,max = 10)
    @Pattern(regexp = "^[0-9]+$")
    private String userContact;
    private String address;
}
