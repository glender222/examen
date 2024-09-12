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
import upeu.edu.pe.examen.Service.ProveedoresService;
import upeu.edu.pe.examen.entity.Proveedores;
@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {
	@Autowired
	private ProveedoresService proveedoresService;
	@GetMapping
	public ResponseEntity<List<Proveedores>> readAll(){
		try {
			List<Proveedores> Proveedores = proveedoresService.readAll();
			if(Proveedores.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Proveedores, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	 }

	@PostMapping
	public ResponseEntity<Proveedores> crear(@Valid @RequestBody Proveedores cat){
		try {
			Proveedores c = proveedoresService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Proveedores> getProveedoresid(@PathVariable("id") Long id){
		try {
			Proveedores c = proveedoresService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<Proveedores> delProveedores(@PathVariable("id") Long id){
		try {
			proveedoresService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}




	@PutMapping("/{id}")
	public ResponseEntity<?> updateProveedores(@PathVariable("id") Long id, @Valid @RequestBody Proveedores cat){

			Optional<Proveedores> c = proveedoresService.read(id);
			if(c.isEmpty()) {
				return new ResponseEntity<>(proveedoresService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}	
	}

}
