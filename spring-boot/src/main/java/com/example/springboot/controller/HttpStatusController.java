package com.example.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status
 * https://www.baeldung.com/spring-response-entity
 */
@RestController
@RequestMapping("/example/http-status")
public class HttpStatusController {

    @RequestMapping("/200")
    public ResponseEntity<String> httpStatus200() {
        return ResponseEntity.ok("HTTP Status 200: OK");
    }

    @RequestMapping("/201")
    public ResponseEntity<String> httpStatus201() {
        // TODO httpStatus201 Created
        //return ResponseEntity.created(...);
        return ResponseEntity.ok("TODO :/");
    }

    @RequestMapping("/202")
    public ResponseEntity<String> httpStatus202() {
        return ResponseEntity.accepted().body("HTTP Status 202: Accepted");
    }

    @RequestMapping("/204")
    public ResponseEntity<String> httpStatus204() {
        return ResponseEntity.ok("HTTP Status 204: No Content");
    }

    @RequestMapping("/400")
    public ResponseEntity<String> httpStatus400() {
        return ResponseEntity.badRequest().body("HTTP Status 400: Bad Request");
    }

    @RequestMapping("/404")
    public ResponseEntity<String> httpStatus404() {
        // TODO body?
        return ResponseEntity.notFound().build();
    }

}
