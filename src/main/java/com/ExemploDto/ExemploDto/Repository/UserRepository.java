package com.ExemploDto.ExemploDto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExemploDto.ExemploDto.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
