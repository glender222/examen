package upeu.edu.pe.examen.Reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.examen.entity.Ordenes;

@Repository
public interface OrdenesRepository extends JpaRepository<Ordenes, Long>{

}
