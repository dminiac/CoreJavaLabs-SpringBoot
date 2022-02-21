package com.abc.trainee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.abc.trainee.entity.Trainee;
import com.abc.trainee.exceptionhandling.TraineeNotFoundException;
import com.abc.trainee.repository.TraineeRepository;

@Service
public class TraineeImpl implements TraineeService {
	
	@Autowired
	private TraineeRepository traineeRepository;
	
	
	@Override
	public Trainee save(Trainee trainee) {
		Trainee savedTrainee=traineeRepository.save(trainee);
		return savedTrainee;
	}

	@Override
	public List<Trainee> getAllTrainee() {
		List<Trainee> trainees = traineeRepository.findAll();
		return trainees;
	}

	@Override
	public Trainee getTraineeById(int traineeId) throws TraineeNotFoundException {
		
		Optional<Trainee> optionalProduct = traineeRepository.findById(traineeId);
		
		if(optionalProduct.isPresent()) {
			throw new TraineeNotFoundException("Sorry! Product is not existing with id: "+traineeId);
		}
		else {
			return optionalProduct.get();
		}
		
	}
	
	@Override
	public Trainee updateTrainee(Trainee trainee) {
		Optional<Trainee>optionalTrainee=traineeRepository.findById(trainee.getTraineeId());
		if(optionalTrainee.isEmpty()) {
			throw new TraineeNotFoundException("Sorry! Product is not exixting with id :"+trainee.getTraineeId());
		}
		Trainee updatetrainee = traineeRepository.save(trainee);
		
		return updatetrainee;
	}

	@Override
	public void deleteTrainee(int traineeId) {
		Optional<Trainee> optionalTrainee=traineeRepository.findById(traineeId);
		
		if(optionalTrainee.isPresent()) {			
			traineeRepository.deleteById(traineeId);			
		}
		else {
			throw new TraineeNotFoundException("Sorry! Product is not existing with id: "+traineeId);
		}
	}

	

	
	
	

}
