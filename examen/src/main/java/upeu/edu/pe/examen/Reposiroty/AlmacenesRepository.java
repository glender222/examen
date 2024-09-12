package upeu.edu.pe.examen.Reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.examen.entity.Almacenes;

@Repository
public interface AlmacenesRepository extends JpaRepository<Almacenes, Long>{

}
