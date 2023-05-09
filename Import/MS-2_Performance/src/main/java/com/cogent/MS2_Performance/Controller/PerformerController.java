package com.cogent.MS2_Performance.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.MS2_Performance.Entity.Performer;
import com.cogent.MS2_Performance.Repo.PerformerRepository;



@RestController
@CrossOrigin
@RequestMapping("/performance-api")
public class PerformerController {
	
	@Autowired
	PerformerRepository performerRepository;
	
	@PostMapping("addperformer")
	public Performer addPerformer(@RequestBody Performer newPerformer) {
		System.out.println("Adding record to database");
		return performerRepository.save(newPerformer);

	}
	
	@GetMapping("getperformer")
	public List<Performer> getPerformer() {

		return performerRepository.findAll();

	}
	@GetMapping("helloperformer")
	public String Hello() {
		System.out.println("Employee trying to call the performer.");
		return "<h1>Hello Performer!</h1>";
	}
	
	
	
	@DeleteMapping("deleteperformer/{id}")
	public void deletePerformer(@PathVariable("id") int id) {
		performerRepository.deleteById(id);
	}

}
