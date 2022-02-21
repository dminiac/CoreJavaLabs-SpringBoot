package com.abc.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.abc.trainee.entity.Trainee;
import com.abc.trainee.service.TraineeService;



@RestController
@RequestMapping("/Trainee")
public class TraineeController {
	
	@Autowired //bean definitions autowired
	private TraineeService traineeService;
	
	@PostMapping("/savee") //save purpose we this
	public ResponseEntity<Trainee> addTrainee(@RequestBody Trainee trainee) {  
		
		Trainee newTrainee = traineeService.save(trainee);
		
		ResponseEntity<Trainee> responseEntity = new ResponseEntity<>(newTrainee,HttpStatus.CREATED);
		
		return responseEntity;	
		
	}
	
	@GetMapping("/all") //for getting details we use this @GetMapping
	public List<Trainee> fecthAllTrainees(Trainee trainee)
	{
		List<Trainee> products=traineeService.getAllTrainee();
		return products;
		
	}
	
	
	@GetMapping("/get/{tid}")
	public  ResponseEntity<?> fetchProductDetails(@PathVariable("tid") int productId) {
		
		Trainee trainee = traineeService.getTraineeById(productId);
		return new ResponseEntity<>(trainee, HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/delete/{tid}")
	public ResponseEntity<?> deleteProduct(@PathVariable("tid") int traineeId) {
		traineeService.deleteTrainee(traineeId);
		return new ResponseEntity<>("TraineeDeleted with id: "+traineeId, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Trainee> modifyTrainee(@RequestBody Trainee trainee) {
		Trainee updatedTrainee = traineeService.updateTrainee(trainee);
		return new ResponseEntity<>(updatedTrainee, HttpStatus.OK);
	}

}
