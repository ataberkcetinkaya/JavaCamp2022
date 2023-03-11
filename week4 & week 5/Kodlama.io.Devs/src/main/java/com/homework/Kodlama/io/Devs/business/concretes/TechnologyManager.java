package com.homework.Kodlama.io.Devs.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.homework.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetTechnologyResponse;
import com.homework.Kodlama.io.Devs.core.utilities.mappers.ModelMapperService;
import com.homework.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.homework.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;
import com.homework.Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	
	private TechnologyRepository technologyRepository;
	private LanguageRepository languageRepository;
	private ModelMapperService modelMapperService;
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository, LanguageRepository languageRepository, ModelMapperService modelMapperService) {
		super();
		this.technologyRepository = technologyRepository;
		this.languageRepository = languageRepository;
		this.modelMapperService = modelMapperService;
	}

	@Override
	public List<GetTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll(); //creating the Technology entity and finding all
		
		List<GetTechnologyResponse> technologyResponse = 
				technologies.stream().map
				(technoloy -> modelMapperService.forResponse().map(technologies, GetTechnologyResponse.class)).collect(Collectors.toList());
	
		return technologyResponse;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		Technology technology = modelMapperService.forRequest().map(createTechnologyRequest, Technology.class);
		technologyRepository.save(technology);
		
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
