package pe.edu.upeu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.upeu.examen.entity.Libros;
import pe.edu.upeu.examen.repository.LibrosRepository;
import pe.edu.upeu.service.SLibros;


@Service
public class LibrosServiceImp implements SLibros{

	@Autowired
	private LibrosRepository Librosrepository;
	
	@Override
	public Libros create(Libros l) {
		// TODO Auto-generated method stub
		return Librosrepository.save(l);
	}

	@Override
	public List<Libros> readAll() {
		// TODO Auto-generated method stub
		return Librosrepository.findAll();
	}

	@Override
	public Libros read(int id) {
		// TODO Auto-generated method stub
		return Librosrepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Librosrepository.deleteById(id);
	}

	@Override
	public Libros update(Libros l) {
		// TODO Auto-generated method stub
		return Librosrepository.save(l);
	}

}
