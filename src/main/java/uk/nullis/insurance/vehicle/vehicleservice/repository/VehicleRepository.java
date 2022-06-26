package uk.nullis.insurance.vehicle.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import uk.nullis.insurance.vehicle.vehicleservice.entities.VehicleEntity;

@Component
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long>  {

}
