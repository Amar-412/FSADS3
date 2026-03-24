package com.klu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.model.User;

public interface UserRespository extends JpaRepository<User,Integer>{
     Optional<User> findByEmail(String email);
}

