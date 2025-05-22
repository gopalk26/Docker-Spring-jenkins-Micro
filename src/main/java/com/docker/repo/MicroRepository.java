package com.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.entity.MicroEntity;

@Repository
public interface MicroRepository extends JpaRepository<MicroEntity, Long> {

}
