package upeu.edu.pe.examen.Service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.examen.entity.Formapago;

public interface FormapagoService {
	Formapago create(Formapago a);
	Formapago update(Formapago a);
	void delete(Long id);
	Optional<Formapago> read(Long id);
	List<Formapago> readAll();
}
