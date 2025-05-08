package com.attendenceSystem.MusterRollSystem.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "subArea")
public class SubArea {
    @Id
    private String subAreaId;
    private String subAreaName;
    @ManyToOne
    @JoinColumn(name = "area_Id")
    private Area area;

    @OneToMany(mappedBy = "subArea")
    private List<SiteArea> siteArea;

    @OneToOne(mappedBy = "subArea")
    private Admin admin;

}
