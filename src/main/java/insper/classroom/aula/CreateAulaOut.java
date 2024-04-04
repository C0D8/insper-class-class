package insper.classroom.aula;

import lombok.Builder;
import lombok.experimental.Accessors;


@Builder
@Accessors(fluent = true, chain = true)
public record CreateAulaOut (
    String id
){
    
}
