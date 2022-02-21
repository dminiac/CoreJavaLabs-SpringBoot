package com.abc.trainee.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="/trainee_tbl")
public class Trainee {
	
	private int traineeId;
	
	private String traineeName;
	
	private String traineeDomain;
	
	private String traineeLocation;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	
	

}
