package upeu.edu.pe.examen.Dao;

import java.util.List;
import java.util.Optional;

import upeu.edu.pe.examen.entity.Proveedores;

public interface ProveedoresDao {
	Proveedores create(Proveedores a);
	Proveedores update(Proveedores a);
	void delete(Long id);
	Optional<Proveedores> read(Long id);
	List<Proveedores> readAll();
}
