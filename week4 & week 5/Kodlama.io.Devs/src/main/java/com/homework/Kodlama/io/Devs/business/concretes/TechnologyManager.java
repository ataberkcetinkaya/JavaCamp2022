package com.homework.Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.homework.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetTechnologyResponse;
import com.homework.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.homework.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;
import com.homework.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	
	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll(); //creating the Technology entity and finding all
		List<GetTechnologyResponse> getTechnologyResponses = new ArrayList<>(); //creating the GetTechnologyResponse and making an arrayList
		for(Technology tech : technologies) { //iterating over Technology,
			GetTechnologyResponse techResponse = new GetTechnologyResponse();
			
			techResponse.setId(tech.getId()); //setting the parts via Technology that we had
			techResponse.setName(tech.getName());
			techResponse.setLangId(tech.getLanguage().getId());
			techResponse.setLangName(tech.getLanguage().getName());
			
			getTechnologyResponses.add(techResponse);
		}
		return getTechnologyResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		Technology technology = new Technology();
		
		Language language = languageRepository.getLanguageById(createTechnologyRequest.getLang_id());
		
		if(technologyRepository.existsByName(createTechnologyRequest.getName())) {
			throw new Exception("This tech is already exists.");
		}
		else if(languageRepository.existsById(createTechnologyRequest.getLang_id())) { //if the Language w given ID is exists, save it. (bc the tech must connect w a language)
			technology.setName(createTechnologyRequest.getName());
			technology.setLanguage(language);
			this.technologyRepository.save(technology);
		}
		else {
			throw new Exception("Language not found.");
		}
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception {
		
		if(technologyRepository.existsByName(updateTechnologyRequest.getName())) {
			throw new Exception("This tech already exists.");
		} else if(technologyRepository.existsById(updateTechnologyRequest.getLang_id())) {
			
			Technology technology = technologyRepository.getTecnologyById(id);
			technology.setName(updateTechnologyRequest.getName());
			
			Language language = languageRepository.getLanguageById(updateTechnologyRequest.getLang_id());
			
			technology.setLanguage(language);
			this.technologyRepository.save(technology);
		} else {
			throw new Exception("Language not found.");
		}
		
	}

	@Override
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
		
	}
	
	

}
