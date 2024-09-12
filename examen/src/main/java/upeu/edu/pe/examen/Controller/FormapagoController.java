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
import upeu.edu.pe.examen.Service.FormapagoService;
import upeu.edu.pe.examen.entity.Formapago;


@RestController
@RequestMapping("/api/formapago")
public class FormapagoController {
@Autowired FormapagoService formapagoService;
	

@GetMapping
public ResponseEntity<List<Formapago>> readAll(){
	try {
		List<Formapago> Formapago = formapagoService.readAll();
		if(Formapago.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(Formapago, HttpStatus.OK);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
 }

@PostMapping
public ResponseEntity<Formapago> crear(@Valid @RequestBody Formapago cat){
	try {
		Formapago c = formapagoService.create(cat);
		return new ResponseEntity<>(c, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

@GetMapping("/{id}")
public ResponseEntity<Formapago> getFormapagoid(@PathVariable("id") Long id){
	try {
		Formapago c = formapagoService.read(id).get();
		return new ResponseEntity<>(c, HttpStatus.CREATED);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}


@DeleteMapping("/{id}")
public ResponseEntity<Formapago> delFormapago(@PathVariable("id") Long id){
	try {
		formapagoService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}




@PutMapping("/{id}")
public ResponseEntity<?> updateFormapago(@PathVariable("id") Long id, @Valid @RequestBody Formapago cat){

		Optional<Formapago> c = formapagoService.read(id);
		if(c.isEmpty()) {
			return new ResponseEntity<>(formapagoService.update(cat), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}	
}


}
