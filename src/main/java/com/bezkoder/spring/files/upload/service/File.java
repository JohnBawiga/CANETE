package com.bezkoder.spring.files.upload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.files.upload.Repository.FileRepository;
import com.bezkoder.spring.files.upload.model.FileInfo;

@Service
public class File {

	@Autowired 
	private FileRepository fileRepository;
	
	public void uploadFile(FileInfo fileinfo) {
		fileRepository.save(fileinfo);
	}
}
