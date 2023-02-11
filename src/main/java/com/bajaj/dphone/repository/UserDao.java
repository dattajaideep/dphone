package com.bajaj.dphone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bajaj.dphone.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity,Integer>  {
    UserDao findByEmail(String userEmail);
}
