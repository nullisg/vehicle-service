package uk.nullis.insurance.vehicle.vehicleservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
	
	String vehicleReg;
	String make;
	String model;
	String owner;
	int engineSizeInCc;
	String transmission;
	short numberOfDoors;

}
