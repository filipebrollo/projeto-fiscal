package br.com.fiscal.fiscalcontrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiscal.fiscalcontrol.entity.Empresa;
import br.com.fiscal.fiscalcontrol.repository.EmpresaRepository;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    // O usuário precisa criar, atualizar, excluir, listar, salvar

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    // Método listar todas as empresas

    public List<Empresa> listarEmpresas() {
        return empresaRepository.findAll();
    }

    // Método de buscar empresa por id específica

    public Optional<Empresa> buscaEmpresaPorId(Long id) {
        return empresaRepository.findById(id);
    }

    // Método de salvar empresa

    public Empresa salvarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    // Método de salvar todas as empresas

    public List<Empresa> salvarTodasEmpresas(List<Empresa> empresas) {
        return empresaRepository.saveAll(empresas);
    }

    // Método de excluir uma empresa

    public void excluirEmpresaPorId(Long id) {
        empresaRepository.deleteById(id);
    }

    // Método de atualizar empresa

    public Empresa atualizarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    // Método de busca por CNPJ, buscando exatamente o número

    // Método busca exata pelo CNPJ completo
    public Optional<Empresa> buscarPorCnpj(String cnpj) {
        return empresaRepository.findByCnpj(cnpj);
    }

    // Método busca parcial pelo CNPJ
    public List<Empresa> buscarPorCnpjParcial(String cnpj) {
        return empresaRepository.findByCnpjContaining(cnpj);
    }

    // Método busca parcial por razão social
    public List<Empresa> buscarPorRazaoSocial(String razaoSocial) {
        return empresaRepository.findByRazaoSocialContainingIgnoreCase(razaoSocial);
    }

    // Método para inativar empresa

    public Optional<Empresa> inativarEmpresa(Long id) {

        Optional<Empresa> empresa = empresaRepository.findById(id);

        if (empresa.isPresent()) {
            empresa.get().setAtiva(false);
            empresaRepository.save(empresa.get());
        }

        return empresa;
    }

    // Método para reativar a Empresa

    public Optional<Empresa> reativarEmpresa(Long id) {

        Optional<Empresa> empresa = empresaRepository.findById(id);

        if (empresa.isPresent()) {
            empresa.get().setAtiva(true);
            empresaRepository.save(empresa.get());
        }

        return empresa;
    }

}