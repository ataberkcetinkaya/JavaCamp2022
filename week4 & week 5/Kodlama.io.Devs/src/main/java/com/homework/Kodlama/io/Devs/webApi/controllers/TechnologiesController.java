package com.homework.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.homework.Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import com.homework.Kodlama.io.Devs.business.responses.GetTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;

	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getalltech")
	public List<GetTechnologyResponse> getAllTech() {
		return technologyService.getAll();
	}
	
	@PostMapping("/addtech")
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.add(createTechnologyRequest);
	}
	
	@PutMapping("/updatetech")
	public void update(UpdateTechnologyRequest updateTechnologyRequest, int id) throws Exception {
		technologyService.update(updateTechnologyRequest, id);
	}
	
	@DeleteMapping("/deletetech")
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyService.delete(deleteTechnologyRequest);
	}

}
