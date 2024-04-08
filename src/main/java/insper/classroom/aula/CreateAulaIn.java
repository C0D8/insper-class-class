package insper.classroom.aula;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 


@Builder
@Accessors(fluent = true, chain = true)
public record CreateAulaIn (
    String data,
    String duracao,
    String descricao,
    String nome,
    String id_professor,
    String departamento
) {
    
}
