package pe.edu.upeu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.upeu.examen.entity.Autores;
import pe.edu.upeu.examen.repository.AutoresRepository;
import pe.edu.upeu.service.SAutores;

@Service
public class AutoresServiceImp implements SAutores{
	
	@Autowired
	private AutoresRepository Autoresrepository;
	
	@Override
	public Autores create(Autores a) {
		// TODO Auto-generated method stub
		return Autoresrepository.save(a);
	}

	@Override
	public List<Autores> readAll() {
		// TODO Auto-generated method stub
		return Autoresrepository.findAll();
	}

	@Override
	public Autores read(int id) {
		// TODO Auto-generated method stub
		return Autoresrepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Autoresrepository.deleteById(id);
	}

	@Override
	public Autores update(Autores a) {
		// TODO Auto-generated method stub
		return Autoresrepository.save(a);
	}
}
