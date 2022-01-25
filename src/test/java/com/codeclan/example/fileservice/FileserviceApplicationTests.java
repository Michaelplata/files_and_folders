package com.codeclan.example.fileservice;

import com.codeclan.example.fileservice.models.File;
import com.codeclan.example.fileservice.models.Folder;
import com.codeclan.example.fileservice.models.User;
import com.codeclan.example.fileservice.repositories.FileRepository;
import com.codeclan.example.fileservice.repositories.FolderRepository;
import com.codeclan.example.fileservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileserviceApplicationTests {

//	@Autowired
//	FolderRepository folderRepository;
//
//	@Autowired
//	UserRepository userRepository;
//
//	@Autowired
//	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createUserAndFolder(){
//		User user1 = new User("Mia");
//		userRepository.save(user1);
//
//		Folder folder = new Folder("picture", user1);
//		folderRepository.save(folder);
//
//	}
//
//	@Test
//	public void createFileAndFolder(){
//		User user2 = new User("Michael");
//		userRepository.save(user2);
//
//		Folder folder1 = new Folder("music", user2);
//		folderRepository.save(folder1);
//
//		File file = new File("electronic", "mp3", 3, folder1);
//		fileRepository.save(file);
//	}

//
}
