package es.tallercan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.tallercan.domainModel.Vehiculo.Vehiculo;
import es.tallercan.domainModel.repositories.VehiculoRepository;


@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@GetMapping
	public List<Vehiculo> getVehiculos(){
		return vehiculoRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Vehiculo getVehiculoById(Long id) {
		
	    return vehiculoRepository.getOne(id);
	}
	
	
	//NO SE SI ESTA bien
	@PutMapping(value = "/{id}")
    public void updateVehiculo(@PathVariable( "id" ) Long id, @RequestBody Vehiculo resource) {
       vehiculoRepository.save(resource);
    }
	
	@DeleteMapping
	public void deleteVehiculo(@PathVariable("id") Vehiculo v) {
		vehiculoRepository.delete(v);
		
	}
	
	

}
