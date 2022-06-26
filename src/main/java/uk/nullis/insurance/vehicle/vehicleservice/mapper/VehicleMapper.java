package uk.nullis.insurance.vehicle.vehicleservice.mapper;

import org.mapstruct.Mapper;

import uk.nullis.insurance.vehicle.vehicleservice.entities.VehicleEntity;
import uk.nullis.insurance.vehicle.vehicleservice.model.Vehicle;

@Mapper(componentModel = "spring")
public abstract class VehicleMapper {

	public abstract VehicleEntity map(Vehicle vehicle);
	
	public abstract Vehicle map(VehicleEntity vehicleEntity);
}
