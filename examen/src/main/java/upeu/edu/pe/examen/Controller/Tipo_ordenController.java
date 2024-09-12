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
import upeu.edu.pe.examen.Service.Tipo_ordenService;
import upeu.edu.pe.examen.entity.Tipo_orden;
@RestController
@RequestMapping("/api/orden")
public class Tipo_ordenController {
	@Autowired
	private Tipo_ordenService ordenService;
	@GetMapping
	public ResponseEntity<List<Tipo_orden>> readAll(){
		try {
			List<Tipo_orden> Tipo_orden = ordenService.readAll();
			if(Tipo_orden.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Tipo_orden, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	 }

	@PostMapping
	public ResponseEntity<Tipo_orden> crear(@Valid @RequestBody Tipo_orden cat){
		try {
			Tipo_orden c = ordenService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tipo_orden> getTipo_ordenid(@PathVariable("id") Long id){
		try {
			Tipo_orden c = ordenService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<Tipo_orden> delTipo_orden(@PathVariable("id") Long id){
		try {
			ordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipo_orden(@PathVariable("id") Long id, @Valid @RequestBody Tipo_orden cat){

			Optional<Tipo_orden> c = ordenService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(ordenService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}	
	}
}
