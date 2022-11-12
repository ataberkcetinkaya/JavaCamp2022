package com.homework.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.homework.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	
	void add(Language language) throws Exception;
	
	void update(int id, String name) throws Exception;
	
	void delete(int id);
}
