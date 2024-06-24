package hello_world_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {



    @Autowired
    private Service helloService;
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        String message = helloService.getHelloMessage();
        return ResponseEntity.ok(message);
    }

    @PostMapping("/hello")
    public ResponseEntity<String> saveHelloMessage(@RequestBody String message) {
        String savedMessage = helloService.saveHelloMessage(message);
        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
    }
}
