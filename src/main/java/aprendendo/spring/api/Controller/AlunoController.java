package aprendendo.spring.api.Controller;

import aprendendo.spring.api.Aluno.adicionaAlunoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //marca a classe como um controlador
@RequestMapping("alunos") //mapeia a classe para requisicoes feitas para o caminho alunos
public class AlunoController {

    @PostMapping
    public void adicionar(@RequestBody adicionaAlunoDTO alunoAdicionado){ //RequestBody indica que alunoAdicionado deve ser convertido para json
        System.out.println(alunoAdicionado);
    }

}


