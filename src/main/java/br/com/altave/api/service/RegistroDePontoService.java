package br.com.altave.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.altave.api.model.RegistroDePonto;
import br.com.altave.api.repository.RegistroDePontoRepository;

@Service
public class RegistroDePontoService {
    private final RegistroDePontoRepository repository;

    public RegistroDePontoService(RegistroDePontoRepository repository) {
        this.repository = repository;
    }

    // Listar todos os registros de ponto
    public List<RegistroDePonto> listarTodos() {
        return repository.findAll();
    }

    // Buscar registro por ID
    public Optional<RegistroDePonto> buscarPorId(Integer idRegistro) {
        return repository.findById(idRegistro);
    }

    // Salvar um novo registro de ponto
    public RegistroDePonto salvar(RegistroDePonto registro) {
        return repository.save(registro);
    }

    // Atualizar um registro existente
    public Optional<RegistroDePonto> atualizar(Integer idRegistro, RegistroDePonto registroAtualizado) {
        return repository.findById(idRegistro).map(registro -> {
            registro.setEmpresa(registroAtualizado.getEmpresa());  // Agora 'empresa' é uma String
            registro.setFuncionario(registroAtualizado.getFuncionario());
            registro.setDiaTrabalhado(registroAtualizado.getDiaTrabalhado());
            registro.setHorarioEntrada(registroAtualizado.getHorarioEntrada());
            registro.setHorarioSaida(registroAtualizado.getHorarioSaida());
            registro.setObservacoes(registroAtualizado.getObservacoes());
            return repository.save(registro);
        });
    }

    // Deletar um registro
    public void deletar(Integer idRegistro) {
        repository.deleteById(idRegistro);
    }
}
