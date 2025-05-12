package com.attendenceSystem.MusterRollSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attendenceSystem.MusterRollSystem.models.User;

public interface UserRepository extends JpaRepository<User, String>{

}
