package com.homework.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.homework.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		for(Language lng : this.languageRepository.getAll()) { // > InMemoryLanguageRepository; will check the languages inside there
			if(language.getName().equals(lng.getName())) {
				throw new Exception("Is exists.");
			} else if(language.getName().isEmpty()) {
				throw new Exception("Cannot be blank");
			} else {
				languageRepository.add(language);
			}
		}
		
	}

	@Override
	public void update(int id, String name) throws Exception {
		for(Language lng : this.languageRepository.getAll()) { // > InMemoryLanguageRepository; will check the languages inside there
			if(name.isEmpty()) {
				throw new Exception("Cannot be blank");
			} else {
				languageRepository.update(id, name);;
			}
		}
		
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
	}

}
