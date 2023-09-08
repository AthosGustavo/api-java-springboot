package aprendendo.spring.api.Aluno;


import aprendendo.spring.api.Disciplina.Disciplina;
import jakarta.persistence.*;
import lombok.Getter;
import java.util.List;

@Getter
@Entity
@Table(name="alunos")
public class Aluno{

    //o spring entende camel case e converte para snake case

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_aluno")
    private Long idAluno;

    private String nomeAluno;

    private Integer idadeAluno;

    @ManyToMany
    @JoinTable(name="aluno_disciplina",
    joinColumns = @JoinColumn(name="id_aluno"),
    inverseJoinColumns = @JoinColumn(name="id_disciplina"))
    private List<Disciplina> listaDisciplina;

    public Aluno(adicionaAlunoDTO alunoAdicionado) {
    }
}
