package com.homework.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.Kodlama.io.Devs.entities.concretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
	Technology getTecnologyById(Integer id);
	boolean existsByName(String name);
}
