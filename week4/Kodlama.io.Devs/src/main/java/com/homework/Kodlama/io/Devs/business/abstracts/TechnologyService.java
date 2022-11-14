package com.homework.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.homework.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetTechnologyResponse;

public interface TechnologyService {
	List<GetTechnologyResponse> getAll();
	
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
}
