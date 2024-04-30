package me.toyproject.test.app.app;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/mvc")
    public ResponseEntity<String> getTest() {
        return ResponseEntity.ok("mvc");
    }
}
