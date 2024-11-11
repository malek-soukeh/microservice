package com.example.gestioninscription.services;

import com.example.gestioninscription.entities.Inscription;

import java.util.List;

public interface IInscriptionServices {

    Inscription addInscription(Inscription inscription);

    Inscription updateInscription(Inscription inscription);

    List<Inscription> findAll();

    Inscription findById(long idInscription);

    void delete(long numInscription);
}
