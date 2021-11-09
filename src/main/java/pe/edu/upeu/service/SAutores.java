package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.examen.entity.Autores;

public interface SAutores {
	Autores create(Autores a);
	List<Autores> readAll();
	Autores read(int id);
	void delete(int id);
	Autores update(Autores a);
	
}
