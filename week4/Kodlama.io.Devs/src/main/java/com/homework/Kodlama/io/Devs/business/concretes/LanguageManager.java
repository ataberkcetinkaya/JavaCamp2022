package com.homework.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.homework.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
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
		return languageRepository.findAll();
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void update(Language language) {
		languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageRepository.deleteById(deleteLanguageRequest.getId());
	}

	
	

}
