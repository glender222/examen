package upeu.edu.pe.examen.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upeu.edu.pe.examen.Dao.FormapagoDao;
import upeu.edu.pe.examen.Service.FormapagoService;
import upeu.edu.pe.examen.entity.Formapago;

@Service
@Transactional

public class FormapagoServiceImpl implements FormapagoService{
@Autowired
private FormapagoDao dao;

@Override
public Formapago create(Formapago a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public Formapago update(Formapago a) {
	// TODO Auto-generated method stub
	return dao.update(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

@Override
public Optional<Formapago> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}

@Override
public List<Formapago> readAll() {
	// TODO Auto-generated method stub
	return dao.readAll();
}
}
