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
import upeu.edu.pe.examen.Service.OrdenesService;
import upeu.edu.pe.examen.entity.Ordenes;

@RestController
@RequestMapping("/api/ordenes")
public class OrdenesController {
	
	@Autowired
	private OrdenesService ordenesService;
	@GetMapping
	public ResponseEntity<List<Ordenes>> readAll(){
		try {
			List<Ordenes> Ordenes = ordenesService.readAll();
			if(Ordenes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Ordenes, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	 }

	@PostMapping
	public ResponseEntity<Ordenes> crear(@Valid @RequestBody Ordenes cat){
		try {
			Ordenes c = ordenesService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Ordenes> getOrdenesid(@PathVariable("id") Long id){
		try {
			Ordenes c = ordenesService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<Ordenes> delOrdenes(@PathVariable("id") Long id){
		try {
			ordenesService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




	@PutMapping("/{id}")
	public ResponseEntity<?> updateOrdenes(@PathVariable("id") Long id, @Valid @RequestBody Ordenes cat){

			Optional<Ordenes> c = ordenesService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(ordenesService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}	
	}

}
