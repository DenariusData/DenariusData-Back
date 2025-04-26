package br.com.altave.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.altave.api.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    @Query("SELECT f.empresa, COUNT(f) FROM Funcionario f GROUP BY f.empresa") 
    List<Object[]> countFuncionariosPorEmpresa();
}
