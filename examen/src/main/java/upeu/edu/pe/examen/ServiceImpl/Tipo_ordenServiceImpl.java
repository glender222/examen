package upeu.edu.pe.examen.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upeu.edu.pe.examen.Dao.Tipo_ordenDao;
import upeu.edu.pe.examen.Service.Tipo_ordenService;
import upeu.edu.pe.examen.entity.Tipo_orden;

@Service
@Transactional
public class Tipo_ordenServiceImpl implements Tipo_ordenService{
@Autowired
private Tipo_ordenDao dao;

@Override
public Tipo_orden create(Tipo_orden a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public Tipo_orden update(Tipo_orden a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

@Override
public Optional<Tipo_orden> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}

@Override
public List<Tipo_orden> readAll() {
	// TODO Auto-generated method stub
	return dao.readAll();
}

}
