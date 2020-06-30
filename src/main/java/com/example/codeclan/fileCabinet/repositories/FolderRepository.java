package com.example.codeclan.fileCabinet.repositories;

import com.example.codeclan.fileCabinet.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
