package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.entity.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer>{

}
