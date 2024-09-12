package upeu.edu.pe.examen.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upeu.edu.pe.examen.Dao.ProveedoresDao;
import upeu.edu.pe.examen.Service.ProveedoresService;
import upeu.edu.pe.examen.entity.Proveedores;

@Service
@Transactional
public class ProveedoresServiceImpl implements ProveedoresService{
@Autowired
private ProveedoresDao dao;

@Override
public Proveedores create(Proveedores a) {
	// TODO Auto-generated method stub
	return dao.create(a);
}

@Override
public Proveedores update(Proveedores a) {
	// TODO Auto-generated method stub
	return dao.update(a);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	dao.delete(id);
}

@Override
public Optional<Proveedores> read(Long id) {
	// TODO Auto-generated method stub
	return dao.read(id);
}

@Override
public List<Proveedores> readAll() {
	// TODO Auto-generated method stub
	return dao.readAll();
}

}
