package hello_world_rest_api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;


@org.springframework.stereotype.Service
public class Service {


    public String getHelloMessage() {
        // For simplicity, directly return "Hello, World!"
        return "Hello, World!";
    }

    public String saveHelloMessage(String message) {
        // If you were saving to a repository, you would do it here
        // For this example, just return the message as confirmation
        return "Saved message: " + message;
    }
}
