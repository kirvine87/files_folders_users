package com.codeclan.example.FileFolderUser.repositories;

import com.codeclan.example.FileFolderUser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}