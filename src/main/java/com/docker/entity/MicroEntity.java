package com.docker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MicroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//
	private Long id;

	private String name;
	private String typeOfProject;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfProject() {
		return typeOfProject;
	}

	public void setTypeOfProject(String typeOfProject) {
		this.typeOfProject = typeOfProject;
	}

}
