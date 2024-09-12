package upeu.edu.pe.examen.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.examen.Dao.FormapagoDao;
import upeu.edu.pe.examen.Reposiroty.FormapagoRepository;
import upeu.edu.pe.examen.entity.Formapago;

@Component
public class FormapagoDaoImpl implements FormapagoDao{
@Autowired
private FormapagoRepository repository;

@Override
public Formapago create(Formapago a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public Formapago update(Formapago a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<Formapago> read(Long id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}

@Override
public List<Formapago> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}
}
