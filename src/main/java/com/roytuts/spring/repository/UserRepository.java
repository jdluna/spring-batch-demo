package com.roytuts.spring.repository;

import com.roytuts.spring.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
