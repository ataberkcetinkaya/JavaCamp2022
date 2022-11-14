package com.homework.Kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homework.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
	Language getLanguageById(Integer id);
	
	boolean existsByName(String name);
}
