package com.example.libraryevents.Controller;

import com.example.libraryevents.DTO.LibraryEvents;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LibraryEventController {
    @PostMapping("/v2/libraryevent")
    public ResponseEntity<LibraryEvents> postLibraryEvent(@RequestBody LibraryEvents libraryEvents) {
        log.info("libraryEvents:{}", libraryEvents);
        //invoke kafka producer
        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvents);
    }
}
