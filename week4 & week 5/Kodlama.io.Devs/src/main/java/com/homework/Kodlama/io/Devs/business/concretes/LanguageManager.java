package com.homework.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.homework.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetLanguageResponse;
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
	public List<GetLanguageResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetLanguageResponse> languagesResponse = new ArrayList<GetLanguageResponse>();
		
		for(Language lang : languages) {
			GetLanguageResponse getResponse = new GetLanguageResponse();
			getResponse.setId(lang.getId());
			getResponse.setName(lang.getName());
			languagesResponse.add(getResponse);
		}
		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		
		if(languageRepository.existsByName(createLanguageRequest.getName())) {
			throw new Exception("This language is already exists.");
		} else if(createLanguageRequest.getName() == null || createLanguageRequest.getName() == "") {
			throw new Exception("Language name cannot be blank");
		} else {
			language.setName(createLanguageRequest.getName());
			languageRepository.save(language);
		}
			
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) { //a new request for update too
		Language language = new Language();
		
		language.setId(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageRepository.deleteById(deleteLanguageRequest.getId());
	}

	
	

}
