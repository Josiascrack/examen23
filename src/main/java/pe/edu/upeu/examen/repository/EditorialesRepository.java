package pe.edu.upeu.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examen.entity.Editoriales;

@Repository
public interface EditorialesRepository extends JpaRepository<Editoriales, Integer>{

}
