package com.codeclan.example.FileFolderUser.repositories;

import com.codeclan.example.FileFolderUser.models.Folder;
import com.codeclan.example.FileFolderUser.projections.EmbedFolderUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolderUser.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
