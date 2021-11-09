package pe.edu.upeu.service;

import java.util.List;


import pe.edu.upeu.examen.entity.Libros;

public interface SLibros {

	Libros create(Libros l);
	List<Libros> readAll();
	Libros read(int id);
	void delete(int id);
	Libros update(Libros l);
}
