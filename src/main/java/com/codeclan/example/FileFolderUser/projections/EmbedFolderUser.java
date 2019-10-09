package com.codeclan.example.FileFolderUser.projections;

import com.codeclan.example.FileFolderUser.models.Folder;
import com.codeclan.example.FileFolderUser.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolderUser", types = Folder.class)
public interface EmbedFolderUser {
    String getTitle();
    User getUser();
}
