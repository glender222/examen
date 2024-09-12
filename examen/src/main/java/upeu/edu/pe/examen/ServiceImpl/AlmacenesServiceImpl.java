package upeu.edu.pe.examen.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upeu.edu.pe.examen.Dao.AlmacenesDao;
import upeu.edu.pe.examen.Service.AlmacenesService;
import upeu.edu.pe.examen.entity.Almacenes;
@Service
@Transactional


public class AlmacenesServiceImpl implements AlmacenesService{
@Autowired 
private AlmacenesDao dao;

@Override
public Almacenes create(Almacenes a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public Almacenes update(Almacenes a) {
	// TODO Auto-generated method stub
	return dao.update(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

@Override
public Optional<Almacenes> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}

@Override
public List<Almacenes> readAll() {
	// TODO Auto-generated method stub
	return dao.readAll();
}
}
