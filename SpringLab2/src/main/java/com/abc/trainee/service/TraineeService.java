package com.abc.trainee.service;

import java.util.List;


import com.abc.trainee.entity.Trainee;

public interface TraineeService {
	
	public Trainee save(Trainee trainee);
	public List<Trainee> getAllTrainee();
	public Trainee getTraineeById(int traineeId);
	public Trainee updateTrainee(Trainee trainee);
	
	public void deleteTrainee(int traineeId);

}
