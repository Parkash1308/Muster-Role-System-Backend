package com.attendenceSystem.MusterRollSystem.services.serviceInterface;

import org.springframework.web.multipart.MultipartFile;

import com.attendenceSystem.MusterRollSystem.dto.UserDto;

public interface UserService {
    UserDto createUser (UserDto userDto, MultipartFile image);

}
