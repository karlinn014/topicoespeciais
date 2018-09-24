package fvs.edu.br.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.domain.Funcionario;
import fvs.edu.br.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioResource {
	@Autowired
	private FuncionarioService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Funcionario func = service.buscar(id);
		
		return ResponseEntity.ok().body(func);
		
	}
	
}
