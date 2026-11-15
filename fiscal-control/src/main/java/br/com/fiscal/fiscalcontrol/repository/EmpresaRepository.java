package br.com.fiscal.fiscalcontrol.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiscal.fiscalcontrol.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    Optional<Empresa> findByCnpj(String cnpj);

    List<Empresa> findByCnpjContaining(String cnpj);

    List<Empresa> findByRazaoSocialContainingIgnoreCase(String razaoSocial);
}