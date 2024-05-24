package io.javacode.resumeportal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javacode.resumeportal.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String Name);
}
