package k1ryl.pocpolymorphicrequestbody.rest;

import k1ryl.pocpolymorphicrequestbody.rest.dto.ParentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polymorphic")
public class Controller {

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody ParentRequest dto) {
        return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
    }
}