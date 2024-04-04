package insper.classroom.auth;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder 
@Accessors(chain = true, fluent = true)
public record CredentialIn(
    String email,
    String password) {

    
}
