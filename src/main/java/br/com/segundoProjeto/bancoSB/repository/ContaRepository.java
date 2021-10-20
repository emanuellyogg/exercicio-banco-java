package br.com.segundoProjeto.bancoSB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.segundoProjeto.bancoSB.model.*;

public interface ContaRepository extends JpaRepository<Conta, String> {

}
