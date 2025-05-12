// package com.attendenceSystem.MusterRollSystem.services.serviceImplementation;


// import org.springframework.stereotype.Service;
// import org.springframework.web.multipart.MultipartFile;

// import com.attendenceSystem.MusterRollSystem.config.FileStorageProperties;
// import com.attendenceSystem.MusterRollSystem.dto.UserDto;
// import com.attendenceSystem.MusterRollSystem.models.Area;
// import com.attendenceSystem.MusterRollSystem.repository.UserRepository;
// import com.attendenceSystem.MusterRollSystem.services.serviceInterface.UserService;
// import com.attendenceSystem.MusterRollSystem.utils.GenerateIdPass;

// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.nio.file.StandardCopyOption;

// import lombok.RequiredArgsConstructor;


// @Service
// @RequiredArgsConstructor
// public class UserServiceImplementation implements UserService{

//     private final UserRepository userRepository;
//     private final FileStorageProperties fileStorageProperties;

//     @Override
//     public UserDto createUser(UserDto userDto, MultipartFile image) {

       
//        try {
//         //Generate file name;
//         String fileName= userDto.getUserId();

//         //path to save the image;
//         Path uploadPath = Paths.get
//             (
//                 fileStorageProperties.
//                 getUploadDir()
//             );

//         if(!Files.exists(uploadPath))
//           {
//             Files.createDirectories(uploadPath);
//           }

//         //sava image to file system
//         Path filePath=uploadPath.resolve(fileName)

//         Files.copy
//         (
//             image.getInputStream(), 
//             filePath,
//             StandardCopyOption.REPLACE_EXISTING
//         );
//         Area area = Area.builder()
//         .areaId(GenerateIdPass.generateUserID(userDto.getHirDate(), userDto.getCnic(), userDto.getSiteAreaId()))


        
//        } catch (Exception e) {
    
//        }

//     }

// }
