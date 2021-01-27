package com.example.mysql.docker.springbootmysqldocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.docker.springbootmysqldocker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
