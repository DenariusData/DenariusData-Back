package br.com.altave.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "registro_de_ponto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroDePonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private Integer idRegistro;

    @Column(name = "empresa", nullable = false)
    private String empresa; // Armazena o CNPJ como string

    @ManyToOne
    @JoinColumn(name = "id_funcionario", nullable = false)
    private Funcionario funcionario;

    @Column(name = "dia_trabalhado", nullable = false)
    private LocalDate diaTrabalhado;

    @Column(name = "horario_entrada", nullable = false)
    private LocalTime horarioEntrada;

    @Column(name = "horario_saida", nullable = false)
    private LocalTime horarioSaida;

    @Column(length = 255)
    private String observacoes;
}
