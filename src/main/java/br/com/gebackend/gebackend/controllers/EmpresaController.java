package br.com.gebackend.gebackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gebackend.gebackend.dto.EmpresaMinDTO;
import br.com.gebackend.gebackend.services.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	public List<EmpresaMinDTO> findAll(){
		
		List<EmpresaMinDTO> result = empresaService.findAll();
		
		return result;
		
	}

}
