package com.example.vem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vem.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}
