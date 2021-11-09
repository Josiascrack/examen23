package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.examen.entity.Autores;

@Repository
public interface AutoresRepository extends JpaRepository<Autores, Integer>{

}
