package upeu.edu.pe.examen.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.examen.Dao.Tipo_ordenDao;
import upeu.edu.pe.examen.Reposiroty.TipoOrdenRepository;
import upeu.edu.pe.examen.entity.Tipo_orden;

@Component
public class Tipo_ordenDaoImpl implements Tipo_ordenDao{
@Autowired
private TipoOrdenRepository repository;

@Override
public Tipo_orden create(Tipo_orden a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public Tipo_orden update(Tipo_orden a) {
	// TODO Auto-generated method stub
	return repository.save(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	repository.deleteById(id);
}

@Override
public Optional<Tipo_orden> read(Long id) {
	// TODO Auto-generated method stub
	return repository.findById(id);
}

@Override
public List<Tipo_orden> readAll() {
	// TODO Auto-generated method stub
	return repository.findAll();
}


}
