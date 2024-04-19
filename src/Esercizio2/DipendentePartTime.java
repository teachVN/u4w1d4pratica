package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendentePartTime extends Dipendente{

    public DipendentePartTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(giorni*60);
    }
}
