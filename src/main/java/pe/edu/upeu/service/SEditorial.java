package pe.edu.upeu.service;

import java.util.List;

import pe.edu.upeu.examen.entity.Editoriales;

public interface SEditorial {

	Editoriales create(Editoriales e);
	List<Editoriales> readAll();
	Editoriales read(int id);
	void delete(int id);
	Editoriales update(Editoriales e);
	
}
