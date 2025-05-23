package com.attendenceSystem.MusterRollSystem.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "area")

public class Area {
    @Id
    private String areaId;
    @Column(name = "area_name", nullable = false, unique = true)
    private String areaName;
    @OneToMany(mappedBy = "area")
    private List<SubArea> subAreas;

}
