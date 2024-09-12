package upeu.edu.pe.examen.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import upeu.edu.pe.examen.Service.AlmacenesService;
import upeu.edu.pe.examen.entity.Almacenes;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenesController {
@Autowired
private AlmacenesService almacenesService;

@GetMapping
public ResponseEntity<List<Almacenes>> readAll(){
	try {
		List<Almacenes> Almacenes = almacenesService.readAll();
		if(Almacenes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(Almacenes, HttpStatus.OK);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
 }

@PostMapping
public ResponseEntity<Almacenes> crear(@Valid @RequestBody Almacenes cat){
	try {
		Almacenes c = almacenesService.create(cat);
		return new ResponseEntity<>(c, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

@GetMapping("/{id}")
public ResponseEntity<Almacenes> getAlmacenesId(@PathVariable("id") Long id){
	try {
		Almacenes c = almacenesService.read(id).get();
		return new ResponseEntity<>(c, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}


@DeleteMapping("/{id}")
public ResponseEntity<Almacenes> delAlmacenes(@PathVariable("id") Long id){
	try {
		almacenesService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}




@PutMapping("/{id}")
public ResponseEntity<?> updateAlmacenes(@PathVariable("id") Long id, @Valid @RequestBody Almacenes cat){

		Optional<Almacenes> c = almacenesService.read(id);
		if(c.isEmpty()) {
			return new ResponseEntity<>(almacenesService.update(cat), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
}








}
