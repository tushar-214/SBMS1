package com.example.rest;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.stream.Stream;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.binding.CustomerBinding;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerRestController {
	
	// here only one request is comming mono means only one request 
	// onlyone object is created and differt output 
	
	@GetMapping(value ="/event", produces = "application/json")
	public ResponseEntity<Mono<CustomerBinding>> getEvent() {
		
	    ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        Date dateInIST = Date.from(istTime.toInstant());
        
		CustomerBinding cb = new CustomerBinding("Tushar", istTime);
		Mono<CustomerBinding> customerMono = Mono.just(cb);
		return new ResponseEntity<Mono<CustomerBinding>>(customerMono ,HttpStatus.OK);

	}
	
	// here only one request is comming flux means streamof multiple request 
	// onlyone object is created and differt output 
		// used in cricket score board 
	
	@GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    
	public ResponseEntity<Flux<CustomerBinding>> getEvents() {
        Flux<CustomerBinding> customerFlux = Flux.fromStream(
                Stream.generate(() -> new CustomerBinding(
                        "Tushar",
                        ZonedDateTime.now(ZoneId.of("Asia/Kolkata"))
                ))
        ).delayElements(Duration.ofSeconds(10)); // Emit events every second

        return ResponseEntity.ok(customerFlux);
    }
	
	
	
	
	
}
