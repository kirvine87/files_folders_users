package com.codeclan.example.FileFolderUser.components;

import com.codeclan.example.FileFolderUser.models.File;
import com.codeclan.example.FileFolderUser.models.Folder;
import com.codeclan.example.FileFolderUser.models.User;
import com.codeclan.example.FileFolderUser.repositories.FileRepository;
import com.codeclan.example.FileFolderUser.repositories.FolderRepository;
import com.codeclan.example.FileFolderUser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("User");
        userRepository.save(user1);

        User user2 = new User("User2");
        userRepository.save(user2);

        Folder folder = new Folder("Data", user1);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Words", user2);
        folderRepository.save(folder2);

        File file = new File("File", "txt", 40, folder);
        fileRepository.save(file);

    }
}
