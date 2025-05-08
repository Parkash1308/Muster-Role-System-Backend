package com.attendenceSystem.MusterRollSystem.models;

import java.sql.Date;
import java.util.List;

import com.attendenceSystem.MusterRollSystem.utils.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    private String userId;
    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private String imageURL;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    private String gender;

    @Column(nullable = false, unique = true)
    private String cnic;

    private String password;
    private Date hirDate;

    @Column(nullable = false)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Employee employee;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Admin admin;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Leave> leave;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Attendence> attendences;

}
