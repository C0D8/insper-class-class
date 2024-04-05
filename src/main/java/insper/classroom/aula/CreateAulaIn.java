package insper.classroom.aula;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 
import java.util.Date;


@Builder
@Accessors(fluent = true, chain = true)
public record CreateAulaIn (
    Date data,
    String duracao,
    String descricao,
    String nome,
    String id_professor
) {
    
}
