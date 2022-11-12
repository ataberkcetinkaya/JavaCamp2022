package com.homework.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.homework.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Python"));
		languages.add(new Language(2, "JAVA"));
	}

	@Override
	public List<Language> getAll() {
		return languages; //return the languages at the end
	}

	@Override
	public void add(Language language) {
		languages.add(language); //add a new language
	}

	@Override
	public void update(int id, String name) {
		for(Language lng : languages) {
			if(lng.getId() == id) {
				lng.setName(name);
			}
		}
		
	}

	@Override
	public void delete(int id) {
		for(Language lng : languages) {
			if(lng.getId() == id) {
				languages.remove(lng);
			}
		}
		
	}

	@Override
	public Language listById(int id) {
		Language lang = null;
		for(Language lng : languages) {
			if(lng.getId() == id) {
				lang = lng; 
			}
	}
		return lang;
	}

	

	
	
}
