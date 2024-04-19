package Esercizio2;

import Esercizio1.Dipartimento;

public class UsaDipendente {

    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0]=new DipendenteFullTime(123, Dipartimento.PRODUZIONE);
        dipendenti[1]= new DipendentePartTime(124, Dipartimento.PRODUZIONE);
        dipendenti[2]=new Dirigente(125, Dipartimento.PRODUZIONE);

        for (int i=0; i<dipendenti.length;i++){
            dipendenti[i].calcolaStipendio(10);
            System.out.println(dipendenti[i].getStipendio());
        }
    }
}
