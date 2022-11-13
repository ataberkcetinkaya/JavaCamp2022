package com.homework.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.homework.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	
	void add(CreateLanguageRequest createLanguageRequest);

	void update(Language language);
	
	void delete(DeleteLanguageRequest deleteLanguageRequest);
}
