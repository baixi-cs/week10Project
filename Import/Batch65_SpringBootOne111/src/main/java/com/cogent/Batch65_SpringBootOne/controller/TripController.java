package com.cogent.Batch65_SpringBootOne.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootOne.entity.Trip;
import com.cogent.Batch65_SpringBootOne.exception.ResourceNotFoundException;
import com.cogent.Batch65_SpringBootOne.repo.TripRepository;

import jakarta.validation.Valid;

@RestController
public class TripController {
	@Autowired
	TripRepository tripRepo;
	
	@GetMapping("/get")
	List<Trip> getTrip(){
		return tripRepo.findAll();
	}
	
	@PostMapping("/add")
	Trip postTrip(@Valid @RequestBody Trip newTrip) {
		System.out.print("add trip****************");
		return tripRepo.save(newTrip);
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteTrip(@PathVariable("id") int id) {
		System.out.print("add trip****************"+ id);
		if(! tripRepo.findById(id).isPresent()) {
			throw new ResourceNotFoundException("dele id data not found");
		}
		tripRepo.deleteById(id);
	}
	
	@PutMapping("/update/id")
	public ResponseEntity <Trip> updateTrip(@PathVariable ("id") int id, @RequestBody Trip tripData){
		Optional <Trip> existTrip = tripRepo.findById(id);
		if(existTrip.isPresent()) {
			Trip t = existTrip.get();
			t.setName(tripData.getName());
			t.setVeg(tripData.isVeg());
			t.setKids(tripData.getKids());
			
			return new ResponseEntity<> (tripRepo.save(t), HttpStatus.OK);
		}
		else {
			throw new ResourceNotFoundException("update id not found");
		}
	
	
	}
	


}