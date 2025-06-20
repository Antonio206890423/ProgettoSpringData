package com.example.ProgettoSpringData.runner;

import com.example.ProgettoSpringData.model.Prenotazione;
import com.example.ProgettoSpringData.repository.PostazioneDAORepository;
import com.example.ProgettoSpringData.repository.UtenteDAORepository;
import com.example.ProgettoSpringData.service.PostazioneService;
import com.example.ProgettoSpringData.service.PrenotazioneService;
import com.example.ProgettoSpringData.service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PrenotazioneRunner implements CommandLineRunner {
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Autowired
    UtenteDAORepository utenteDAO;
    @Autowired
    PostazioneDAORepository postazioneDAO;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("PrenotazioneRunner...");

//        Prenotazione p1 = prenotazioneService.creaPrenotazione();
//        prenotazioneService.salvaPrenotazione(p1);
//        System.out.println("Prenotazione creata con successo!!!");

//        Prenotazione p2 = prenotazioneService.creaPrenotazione1();
//        prenotazioneService.salvaPrenotazione1(p2);
//        System.out.println("Prenotazione1 creata con successo!!!");

//        Prenotazione p3 = prenotazioneService.creaPrenotazione2();
//        prenotazioneService.salvaPrenotazione2(p3);
//        System.out.println("Prenotazione2 creata con successo!!!");

        prenotazioneService.nuovaPrenotazione(utenteDAO.findById(4),postazioneDAO.findById(6), LocalDate.of(2025,2,14));
    }
}