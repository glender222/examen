package upeu.edu.pe.examen.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.examen.Dao.AlmacenesDao;
import upeu.edu.pe.examen.Reposiroty.AlmacenesRepository;
import upeu.edu.pe.examen.entity.Almacenes;
@Component
public class AlmacenesDaoImpl implements AlmacenesDao{
@Autowired
private AlmacenesRepository repository;
	@Override
	public Almacenes create(Almacenes a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Almacenes update(Almacenes a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Almacenes> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Almacenes> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
