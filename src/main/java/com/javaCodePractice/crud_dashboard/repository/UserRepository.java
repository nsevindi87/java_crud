package com.javaCodePractice.crud_dashboard.repository;

import com.javaCodePractice.crud_dashboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
