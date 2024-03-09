package com.bezkoder.spring.files.upload.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.files.upload.model.FileInfo;

@Repository
public interface FileRepository extends JpaRepository<FileInfo, Long>{
	
}
