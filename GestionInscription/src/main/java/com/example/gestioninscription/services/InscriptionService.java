package com.example.gestioninscription.services;

import com.example.gestioninscription.entities.Inscription;
import com.example.gestioninscription.repositories.InscriptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class InscriptionService implements IInscriptionServices{

    private final InscriptionRepository inscriptionRepo;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return  inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public List<Inscription> findAll() {
        return (List<Inscription>) inscriptionRepo.findAll();
    }

    @Override
    public Inscription findById(long idInscription) {
        return inscriptionRepo.findById(idInscription).orElse(null);
    }

    @Override
    public void delete(long idInscription) {
        inscriptionRepo.deleteById(idInscription);

    }
}
