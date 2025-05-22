package com.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.entity.MicroEntity;
import com.docker.repo.MicroRepository;

@Service
public class SpringMicroService {

	
	@Autowired
	private MicroRepository microRepository;

	public MicroEntity saveMicro(MicroEntity microEntity) {
		return microRepository.save(microEntity);
	}

	public List<MicroEntity> getMicro() {
		// TODO Auto-generated method stub
		return microRepository.findAll();
	}

}
