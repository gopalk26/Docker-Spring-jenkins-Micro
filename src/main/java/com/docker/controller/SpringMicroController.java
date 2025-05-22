package com.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.entity.MicroEntity;
import com.docker.service.SpringMicroService;

@RequestMapping("/api")
@RestController
public class SpringMicroController {

	@Autowired
	private SpringMicroService springMicroService;

	@PostMapping("/saveMicro")
	public ResponseEntity<Object> saveMicro(@RequestBody MicroEntity microEntity) {
		MicroEntity saveMicro = springMicroService.saveMicro(microEntity);

		return new ResponseEntity<Object>(saveMicro, HttpStatus.OK);
	}

	@PostMapping("/getMicro")
	public ResponseEntity<Object> getMicro() {
		List<MicroEntity> saveMicro = springMicroService.getMicro();

		return new ResponseEntity<Object>(saveMicro, HttpStatus.OK);
	}
}
