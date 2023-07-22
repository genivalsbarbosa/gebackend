package br.com.gebackend.gebackend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gebackend.gebackend.dto.EmpresaMinDTO;
import br.com.gebackend.gebackend.entities.Empresa;
import br.com.gebackend.gebackend.repositories.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<EmpresaMinDTO> findAll() {
		
		List<Empresa> result = empresaRepository.findAll();
		
		List<EmpresaMinDTO> dto = result.stream().map(x -> new EmpresaMinDTO(x)).toList();
		
		return dto;
		
	}

}
