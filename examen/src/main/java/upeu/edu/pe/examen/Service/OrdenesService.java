package upeu.edu.pe.examen.Service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.examen.entity.Ordenes;

public interface OrdenesService {
	Ordenes create(Ordenes a);
	Ordenes update(Ordenes a);
	void delete(Long id);
	Optional<Ordenes> read(Long id);
	List<Ordenes> readAll();
}
