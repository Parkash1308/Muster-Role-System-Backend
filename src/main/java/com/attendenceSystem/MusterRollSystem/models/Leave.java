package com.attendenceSystem.MusterRollSystem.models;

import java.sql.Date;

import com.attendenceSystem.MusterRollSystem.utils.LeaveStatus;
import com.attendenceSystem.MusterRollSystem.utils.LeaveType;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "leave")

public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveId;
    @Enumerated(EnumType.STRING)
    private LeaveStatus leaveStatus;
    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date endDate;
    @Column(nullable = false)
    private String reason;
    private int remainingLeaves;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
