package com.carcass.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carcass.practice.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,String>{

}
