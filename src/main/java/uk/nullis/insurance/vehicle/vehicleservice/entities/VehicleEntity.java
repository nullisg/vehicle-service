package uk.nullis.insurance.vehicle.vehicleservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles")
public class VehicleEntity {
	
	@Id
	@GeneratedValue
	private long id;
	@Column
	String vehicleReg;
	@Column
	String make;
	@Column
	String model;
	@Column
	String owner;
	@Column
	int engineSizeInCc;
	@Column
	String transmission;
	@Column
	short numberOfDoors;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVehicleReg() {
		return vehicleReg;
	}
	public void setVehicleReg(String vehicleReg) {
		this.vehicleReg = vehicleReg;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getEngineSizeInCc() {
		return engineSizeInCc;
	}
	public void setEngineSizeInCc(int engineSizeInCc) {
		this.engineSizeInCc = engineSizeInCc;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public short getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(short numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	

}
