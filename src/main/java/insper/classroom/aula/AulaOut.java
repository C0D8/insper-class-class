package insper.classroom.aula;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 


@Builder
@Accessors(fluent = true, chain = true)
public record AulaOut (
    String data,
    String duracao,
    String nome

) {
    
}
