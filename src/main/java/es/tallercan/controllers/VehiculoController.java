package es.tallercan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import es.tallercan.domainModel.Vehiculo.Vehiculo;
import es.tallercan.domainModel.repositories.VehiculoRepository;



@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
	
	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> getVehiculos(){
		return vehiculoRepository.findAll();
	}
	
	@GetMapping("/vehiculos/{id}")
	public Vehiculo getVehiculoById( @PathVariable("id") Long id) {
		
	    return vehiculoRepository.getOne(id);
	}
	
	
	//NO SE SI ESTA bien
	//public void updateVehiculo(@PathVariable( "id" ) Long id, @RequestBody Vehiculo resource) 
	@PostMapping(value = "/vehiculos")
    public ResponseEntity<?> createVehiculo(@RequestBody Vehiculo resource) {
       vehiculoRepository.save(resource);
       return new ResponseEntity<Vehiculo>(resource, HttpStatus.OK);
    }
	
	@DeleteMapping("/vehiculos/{id}")
	public ResponseEntity<?> deleteVehiculo(@PathVariable Long id) {
		Vehiculo vehiculoToDelete = vehiculoRepository.getOne(id);
		
		if(vehiculoToDelete == null) {
			return new ResponseEntity<String>("No se ha encontrado el vehiculo con el ID "
					+ id, HttpStatus.NOT_FOUND);
		}
		
		vehiculoRepository.delete(vehiculoToDelete);
		return new ResponseEntity<Vehiculo>(vehiculoToDelete, HttpStatus.OK);
		
		
	}
	
	

}
