package com.attendenceSystem.MusterRollSystem.models;

import java.sql.Date;
import java.sql.Time;

import com.attendenceSystem.MusterRollSystem.utils.AttendenceStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "attendence")
public class Attendence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendenceId;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private Time inTime;
    @Column(nullable = false)
    private Time ouTime;
    @Enumerated(EnumType.STRING)
    private AttendenceStatus attendenceStatus;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
