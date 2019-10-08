package com.codeclan.example.FileFolderUser.repositories;

import com.codeclan.example.FileFolderUser.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
