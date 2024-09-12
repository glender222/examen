package upeu.edu.pe.examen.Reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.examen.entity.Tipo_orden;

@Repository
public interface TipoOrdenRepository extends JpaRepository<Tipo_orden, Long>{

}
