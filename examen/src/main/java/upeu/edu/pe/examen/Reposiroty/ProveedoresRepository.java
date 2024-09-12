package upeu.edu.pe.examen.Reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.examen.entity.Proveedores;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Long>{

}
