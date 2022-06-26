package uk.nullis.insurance.vehicle.vehicleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import uk.nullis.insurance.vehicle.vehicleservice.entities.VehicleEntity;
import uk.nullis.insurance.vehicle.vehicleservice.mapper.VehicleMapper;
import uk.nullis.insurance.vehicle.vehicleservice.model.Vehicle;
import uk.nullis.insurance.vehicle.vehicleservice.repository.VehicleRepository;



@RestController
public class Controller {
	
	private VehicleMapper vehicleMapper;
	private VehicleRepository vehicleRepository;
	
	@Autowired
	public Controller(VehicleMapper vehicleMapper, VehicleRepository vehicleRepository) {
		this.vehicleMapper = vehicleMapper;
		this.vehicleRepository = vehicleRepository;
	}
	
	@GetMapping("/")
	@ResponseBody
	public String ping() {
		return "Hello, world!";
	}
	
	@PostMapping("/")
	@ResponseBody
	public Long addVehicle(@RequestBody Vehicle vehicle) {
		
		VehicleEntity vehicleEntity = vehicleMapper.map(vehicle);
		vehicleRepository.save(vehicleEntity);
		
		return vehicleEntity.getId();
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Vehicle getVehicle(@PathVariable Long id) {
		
		VehicleEntity vehicleEntity = vehicleRepository.getReferenceById(id);
		
		return vehicleMapper.map(vehicleEntity);
		
	}
	

}
