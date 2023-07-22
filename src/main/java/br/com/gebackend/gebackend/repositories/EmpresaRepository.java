package br.com.gebackend.gebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gebackend.gebackend.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
