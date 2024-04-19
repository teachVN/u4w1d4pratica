package Esercizio2;

import Esercizio1.Dipartimento;

public class Dirigente extends Dipendente{

    public Dirigente(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public void calcolaStipendio(int giorni) {
        setStipendio(3000);
    }
}
