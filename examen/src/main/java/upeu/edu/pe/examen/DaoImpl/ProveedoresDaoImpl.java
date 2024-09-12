package upeu.edu.pe.examen.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.examen.Dao.ProveedoresDao;
import upeu.edu.pe.examen.Reposiroty.ProveedoresRepository;
import upeu.edu.pe.examen.entity.Proveedores;

@Component
public class ProveedoresDaoImpl implements ProveedoresDao{
@Autowired
private ProveedoresRepository repository;

@Override
public Proveedores create(Proveedores a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public Proveedores update(Proveedores a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<Proveedores> read(Long id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}

@Override
public List<Proveedores> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}
}
