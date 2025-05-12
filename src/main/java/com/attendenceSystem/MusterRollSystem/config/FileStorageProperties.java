package com.attendenceSystem.MusterRollSystem.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.NotBlank;

@Component
@ConfigurationProperties(prefix = "file")
@Validated
public class FileStorageProperties {
    @NotBlank(message="Upload directory must not be blank")
    private String uploadDir;



    public String getUploadDir(){
        return uploadDir;
    }
    public void setUploadDir(String uploadDir){
        this.uploadDir=uploadDir;
    }
}
