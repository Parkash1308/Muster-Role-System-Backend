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
@Table(name = "siteArea")
public class SiteArea {
    @Id
    private String siteAreaId;
    private String siteAreaName;

    @ManyToOne
    @JoinColumn(name = "subArea_Id")
    private SubArea subArea;

    @OneToMany(mappedBy = "siteArea")
    private List<Employee> employee;

    @OneToOne(mappedBy = "siteArea")
    private Location location;

}
