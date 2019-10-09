package com.codeclan.example.FileFolderUser.repositories;

import com.codeclan.example.FileFolderUser.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FileRepository extends JpaRepository<File, Long> {
}
