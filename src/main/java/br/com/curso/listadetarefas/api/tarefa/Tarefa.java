package br.com.curso.listadetarefas.api.tarefa;

// Fazendo os imports das bibliotecas
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_tarefas")

public class Tarefa {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private boolean concluida;

}
