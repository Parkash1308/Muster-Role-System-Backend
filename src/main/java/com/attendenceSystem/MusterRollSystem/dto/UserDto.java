package com.attendenceSystem.MusterRollSystem.dto;

import java.sql.Date;
import com.attendenceSystem.MusterRollSystem.utils.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String imageURL;
    private String email;
    private String phoneNumber;
    private String gender;
    private String cnic;
    private String password;
    private Date hirDate;
    private Role role;
}
