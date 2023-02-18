package com.homework.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import com.homework.Kodlama.io.Devs.business.requests.CreateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetLanguageResponse;

public interface LanguageService {
	List<GetLanguageResponse> getAll();
	
	void add(CreateLanguageRequest createLanguageRequest) throws Exception;

	void update(UpdateLanguageRequest updateLanguageRequest);
	
	void delete(DeleteLanguageRequest deleteLanguageRequest);
}
