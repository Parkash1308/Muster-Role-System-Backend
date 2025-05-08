package com.attendenceSystem.MusterRollSystem.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
@Table(name = "admin")

public class Admin {

    @Id
    private String adminId;

    @OneToOne
    @JoinColumn(name = "subArea_Id")
    private SubArea subArea;

    @OneToMany(mappedBy = "admin")
    private List<Employee> employee;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId")
    private User user;

}
