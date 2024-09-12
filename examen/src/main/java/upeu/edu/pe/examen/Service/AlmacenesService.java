package upeu.edu.pe.examen.Service;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.examen.entity.Almacenes;

public interface AlmacenesService {
	Almacenes create(Almacenes a);
	Almacenes update(Almacenes a);
	void delete(Long id);
	Optional<Almacenes> read(Long id);
	List<Almacenes> readAll();
}
