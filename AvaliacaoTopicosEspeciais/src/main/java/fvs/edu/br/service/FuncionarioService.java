package fvs.edu.br.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Funcionario;
import fvs.edu.br.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario buscar(Integer id) {
		Optional<Funcionario> objeto = repo.findById(id);
		
		return objeto.orElse(null);
		
		
	}

}
