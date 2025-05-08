package com.attendenceSystem.MusterRollSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attendenceSystem.MusterRollSystem.dto.AreaDto;
import com.attendenceSystem.MusterRollSystem.services.serviceInterface.AreaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/area")
public class AreaController {
    private AreaService areaService;

    AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @PostMapping("/addArea")
    public AreaDto postMethodName(@RequestBody AreaDto areaDto) {
        
        return areaService.addArea(areaDto);

    }

}
