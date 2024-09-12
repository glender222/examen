package upeu.edu.pe.examen.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.examen.Dao.OrdenesDao;
import upeu.edu.pe.examen.Reposiroty.OrdenesRepository;
import upeu.edu.pe.examen.entity.Ordenes;
@Component
public class OrdenesDaoImpl implements OrdenesDao{
@Autowired
private OrdenesRepository repository;

@Override
public Ordenes create(Ordenes a) {
	// TODO Auto-generated method stub
	return repository.save(a);}

@Override
public Ordenes update(Ordenes a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<Ordenes> read(Long id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}

@Override
public List<Ordenes> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}
}
