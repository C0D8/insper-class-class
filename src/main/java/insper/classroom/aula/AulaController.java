package insper.classroom.aula;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("classroom-aula")
public interface AulaController {

    @PostMapping("/aulas/register")
    ResponseEntity<?> create (
        @RequestBody(required = true) CreateAulaIn in
    );

    @GetMapping("aulas/{id}")
    ResponseEntity<?> get (
        @PathVariable(required = true) String id
        
    );
    
   
}