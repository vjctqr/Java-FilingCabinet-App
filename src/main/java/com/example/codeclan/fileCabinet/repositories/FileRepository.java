package com.example.codeclan.fileCabinet.repositories;


import com.example.codeclan.fileCabinet.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
