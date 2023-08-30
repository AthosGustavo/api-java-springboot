package aprendendo.spring.api.Professor;

import aprendendo.spring.api.Disciplina.Disciplina;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Entity
@Table(name="professores")
public class Professor{

    private Long idProfessor;
    private String nomeProfessor;
    private String materiaEnsinada;

    @OneToMany(mappedBy = "professor")//ler-se: a classe professor pode ter várias classes disciplína
    private List<Disciplina> listaDisciplina;
}


