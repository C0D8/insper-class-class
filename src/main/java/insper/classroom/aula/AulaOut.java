package insper.classroom.aula;

import lombok.Builder;
import lombok.experimental.Accessors;
//importar data 
import java.util.Date;


@Builder
@Accessors(fluent = true, chain = true)
public record AulaOut (
    Date data,
    String duracao,
    String nome

) {
    
}
