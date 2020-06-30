package com.example.codeclan.fileCabinet.components;

import com.example.codeclan.fileCabinet.models.File;
import com.example.codeclan.fileCabinet.models.Folder;
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

    @Override
    public void run(ApplicationArguments args){

        Folder accounts = new Folder("Accounts", "Johnny");
        folderRepository.save(accounts);
        Folder legal = new Folder("Legal");
        folderRepository.save(legal);

        File salaries = new File("Salaries", "pdf", 58, folder);
        fileRepository.save(salaries);
        File expenses = new File("Expenses");
        fileRepository.save(expenses);



    }
}
