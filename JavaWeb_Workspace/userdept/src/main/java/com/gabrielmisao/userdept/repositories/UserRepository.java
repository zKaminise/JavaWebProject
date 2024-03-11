package com.gabrielmisao.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielmisao.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
