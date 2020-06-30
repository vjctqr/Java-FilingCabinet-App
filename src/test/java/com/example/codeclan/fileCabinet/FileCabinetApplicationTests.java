package com.example.codeclan.fileCabinet;

import com.example.codeclan.fileCabinet.models.Folder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(StringRunner.class)
@SpringBootTest
public class FileCabinetApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolder(){
		Folder folder new Folder("Accounts");
		folderRepository.save(folder);

		File file1 = new File
	}



}
