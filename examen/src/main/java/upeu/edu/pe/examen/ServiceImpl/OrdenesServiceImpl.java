package upeu.edu.pe.examen.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upeu.edu.pe.examen.Dao.OrdenesDao;
import upeu.edu.pe.examen.Service.OrdenesService;
import upeu.edu.pe.examen.entity.Ordenes;

@Service
@Transactional
public class OrdenesServiceImpl implements OrdenesService{
@Autowired
private OrdenesDao dao;

@Override
public Ordenes create(Ordenes a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public Ordenes update(Ordenes a) {
	// TODO Auto-generated method stub
	return dao.update(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

@Override
public Optional<Ordenes> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}

@Override
public List<Ordenes> readAll() {
	// TODO Auto-generated method stub
	return dao.readAll();
}
}
