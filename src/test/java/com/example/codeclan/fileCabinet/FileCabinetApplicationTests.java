package com.example.codeclan.fileCabinet;

import com.example.codeclan.fileCabinet.models.File;
import com.example.codeclan.fileCabinet.models.Folder;
import com.example.codeclan.fileCabinet.repositories.FileRepository;
import com.example.codeclan.fileCabinet.repositories.FolderRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FileCabinetApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

//	@Autowired
//	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder = new Folder("Accounts", "John");
		folderRepository.save(folder);

		File accounts = new File("Salaries", "pdf", 150, folder);
		fileRepository.save(accounts);
	}



}
