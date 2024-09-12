package upeu.edu.pe.examen.Reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.examen.entity.Formapago;

@Repository
public interface FormapagoRepository extends JpaRepository<Formapago, Long>{

}
