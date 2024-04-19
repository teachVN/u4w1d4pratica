package Esercizio3;

import Esercizio1.Dipartimento;

public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(giorni*60);
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio attivita ore 14");
    }
}
