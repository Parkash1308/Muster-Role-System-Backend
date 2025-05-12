package com.attendenceSystem.MusterRollSystem.services.serviceImplementation;

import org.springframework.stereotype.Service;

import com.attendenceSystem.MusterRollSystem.dto.AreaDto;
import com.attendenceSystem.MusterRollSystem.models.Area;
import com.attendenceSystem.MusterRollSystem.repository.AreaRepository;
import com.attendenceSystem.MusterRollSystem.services.serviceInterface.AreaService;
import com.attendenceSystem.MusterRollSystem.utils.GenerateIdPass;

@Service
public class AreaServiceImplementation implements AreaService {
    private AreaRepository areaRepository;

    AreaServiceImplementation(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @Override
    public AreaDto addArea(AreaDto areaDto) {
        String areaId = GenerateIdPass.generateAreaId(areaDto.getAreaName());
        Area area = Area.builder()
                .areaId(areaId)
                .areaName(areaDto.getAreaName())
                .build();
        Area savedArea = areaRepository.save(area);
        return AreaDto.builder()
                .areaId(savedArea.getAreaId())
                .areaName(savedArea.getAreaName())
                .build();
    }

}
