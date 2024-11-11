package com.example.gestioninscription.controllers;


import com.example.gestioninscription.entities.Inscription;
import com.example.gestioninscription.services.IInscriptionServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inscription")
public class InscriptionController {


    private final IInscriptionServices inscriptionService  ;


    @PostMapping
    public Inscription addInscription(@RequestBody Inscription inscription) {
        return inscriptionService.addInscription(inscription);

    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription) {
        return inscriptionService.updateInscription(inscription);
    }


    @GetMapping
    public List<Inscription> findAll() {
        return inscriptionService.findAll();
    }

    @GetMapping("{id}")
    public Inscription findById(@PathVariable long id) {
        Inscription inscription = inscriptionService.findById(id);
        return inscription;
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable long id) {

        inscriptionService.delete(id);
        return true;
    }

}
