package com.tf1.FinalExamenArquitectura.controller;

import com.tf1.FinalExamenArquitectura.domain.entity.Adelanto;
import com.tf1.FinalExamenArquitectura.domain.service.AdelantoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/adelanto")
public class AdelantoController {
    @Autowired
    private AdelantoService adelantoService;

    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Adelanto> getById(@PathVariable("id") Long id) {
        try {
            Optional<Adelanto> optionalAdelanto = adelantoService.findById(id);
            if(optionalAdelanto.isPresent()){
                return new ResponseEntity<Adelanto>(optionalAdelanto.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Adelanto> save(@RequestBody Adelanto adelanto, BindingResult result) {

        try {
            Adelanto adelantoCreate = adelantoService.save(adelanto);
            return ResponseEntity.status(HttpStatus.CREATED).body(adelantoCreate);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
