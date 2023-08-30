package aprendendo.spring.api.Disciplina;

import aprendendo.spring.api.Aluno.Aluno;
import aprendendo.spring.api.Professor.Professor;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name="disciplinas")
public class Disciplina{

    private Long idDisciplina;
    private String nomeDisciplina;

    @ManyToOne
    @JoinColumn(name="id_professor")
    private Professor professor;

    @ManyToMany(mappedBy = "listaDisciplinas")
    private List<Aluno> listaAlunos;

}
