package pe.edu.upeu.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examen.entity.Editoriales;
import pe.edu.upeu.examen.repository.EditorialesRepository;
import pe.edu.upeu.service.SEditorial;



@Service
public class EditorialesServiceImp implements SEditorial{

	@Autowired
	private EditorialesRepository Editorialesrepository;
	@Override
	public Editoriales create(Editoriales e) {
		// TODO Auto-generated method stub
		return Editorialesrepository.save(e);
	}

	@Override
	public List<Editoriales> readAll() {
		// TODO Auto-generated method stub
		return Editorialesrepository.findAll();
	}

	@Override
	public Editoriales read(int id) {
		// TODO Auto-generated method stub
		return Editorialesrepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Editorialesrepository.deleteById(id);
	}

	@Override
	public Editoriales update(Editoriales e) {
		// TODO Auto-generated method stub
		return Editorialesrepository.save(e);
	}


	}
	

