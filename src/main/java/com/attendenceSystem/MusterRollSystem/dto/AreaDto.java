package com.attendenceSystem.MusterRollSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AreaDto {
    private String areaId;
    private String areaName;

}
