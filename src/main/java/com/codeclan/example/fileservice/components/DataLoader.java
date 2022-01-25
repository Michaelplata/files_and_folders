package com.codeclan.example.fileservice.components;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
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

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User user3 = new User("Oli");
        userRepository.save(user3);

        User user4 = new User("Lili");
        userRepository.save(user4);

        User user5 = new User("Nina");
        userRepository.save(user5);

        User user6 = new User("Franek");
        userRepository.save(user6);

        User user7 = new User("Marcel");
        userRepository.save(user7);

        User user8 = new User("Iga");
        userRepository.save(user8);

        Folder folder2 = new Folder("business", user8);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("study", user8);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("holiday", user7);
        folderRepository.save(folder4);

        Folder folder5 = new Folder("history", user6);
        folderRepository.save(folder5);

        Folder folder6 = new Folder("sport", user3);
        folderRepository.save(folder6);

        Folder folder7 = new Folder("psychology", user4);
        folderRepository.save(folder7);

        Folder folder8 = new Folder("money", user3);
        folderRepository.save(folder8);

        Folder folder9 = new Folder("music", user4);
        folderRepository.save(folder9);


        File file2 = new File("atmospheric", "mp3", 3, folder9);
        fileRepository.save(file2);

        File file3 = new File("jazz", "mp3", 4, folder9);
        fileRepository.save(file3);

        File file4 = new File("savvy", "txt", 2, folder8);
        fileRepository.save(file3);

        File file5 = new File("cognition", "txt", 2, folder7);
        fileRepository.save(file5);

        File file6 = new File("triathlon", "txt", 2, folder6);
        fileRepository.save(file6);

        File file7 = new File("art", "mov", 14, folder5);
        fileRepository.save(file7);

    }
}
