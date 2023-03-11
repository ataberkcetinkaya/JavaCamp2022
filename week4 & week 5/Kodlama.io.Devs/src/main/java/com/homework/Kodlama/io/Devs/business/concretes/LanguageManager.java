package com.homework.Kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.homework.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetLanguageResponse;
import com.homework.Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import com.homework.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	private ModelMapperService modelMapperService;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository, ModelMapperService modelMapperService) {
		super();
		this.languageRepository = languageRepository;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public List<GetLanguageResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		
		List<GetLanguageResponse> languageResponse = 
				languages.stream().map
				(language -> modelMapperService.forResponse().map(language, GetLanguageResponse.class)).collect(Collectors.toList());
		
		return languageResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = modelMapperService.forRequest().map(createLanguageRequest, Language.class);
		languageRepository.save(language);
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) { //a new request for update too
		Language language = modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
		languageRepository.save(language);
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageRepository.deleteById(deleteLanguageRequest.getId());
	}

	
	

}
