package com.otx.repository;

import org.jboss.jandex.Main;
import org.springframework.data.jpa.repository.JpaRepository;

import com.otx.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
