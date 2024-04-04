package main.java.insper.classroom.aula;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record CreateAulaIn (
    Date data,
    Integer duracao,
    String descricao,
    String materia,
    Integer idProfessor
) {
    
}
