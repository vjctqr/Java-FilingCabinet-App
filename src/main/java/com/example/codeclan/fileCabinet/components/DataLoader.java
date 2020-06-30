package com.example.codeclan.fileCabinet.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sun.reflect.generics.repository.FieldRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fieldRepository;

    @Autowired
    FolderRepository foldre
}
