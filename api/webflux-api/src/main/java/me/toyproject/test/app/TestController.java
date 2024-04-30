package me.toyproject.test.app;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class TestController {

    @GetMapping("/webflux")
    public Mono<ResponseEntity<String>> getTest() {
        return Mono.just(ResponseEntity.ok("test"))
                .delayElement(java.time.Duration.ofMillis(1000))
                ;
    }
}
