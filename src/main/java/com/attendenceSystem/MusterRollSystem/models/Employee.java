package com.attendenceSystem.MusterRollSystem.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
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
@Table(name = "employee")

public class Employee {

    @Id
    @Column(nullable = false, unique = true)
    private String employeeId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "siteArea_Id", nullable = false)
    private SiteArea siteArea;

    @ManyToOne
    @JoinColumn(name = "admin_Id", nullable = false)
    private Admin admin;
}
