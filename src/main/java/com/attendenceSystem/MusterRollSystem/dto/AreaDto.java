package com.attendenceSystem.MusterRollSystem.dto;

import java.util.List;

import com.attendenceSystem.MusterRollSystem.models.SubArea;

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
    private List<SubArea> subAreas;
}
