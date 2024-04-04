package insper.classroom.aula;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("classroom-aula")
public interface AulaController {

    @PostMapping("/aula/register")
    ResponseEntity<?> create (
        @RequestBody(required = true) CreateAulaIn in
    );

    @GetMapping("aula/{id}")
    ResponseEntity<?> get (
        @PathVariable(required = true) String id
    );
    
   
}