package com.homework.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.homework.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetTechnologyResponse;

public interface TechnologyService {
	List<GetTechnologyResponse> getAll();
	
	void add(CreateTechnologyRequest createTechnologyRequest) throws Exception;
	
	void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception;
	
	void delete(DeleteTechnologyRequest deleteTechnologyRequest);
}
