package Esercizio3;
import Esercizio1.Dipartimento;
import Esercizio3.DipendenteFullTime;
import Esercizio3.DipendentePartTime;
public class Main {
    public static void main(String[] args) {
        InizioAttivita[] array = new InizioAttivita[3];
        array[0] = new DipendenteFullTime(123, Dipartimento.PRODUZIONE);
        array[1] = new DipendentePartTime(124,Dipartimento.PRODUZIONE);
        array[2] = new Volontario ("Roberto",24,"volontario");

        //InizioAttivita primoDipendente = new DipendenteFullTime(123, Dipartimento.PRODUZIONE);

        for (int i = 0; i < array.length; i++) {
            array[i].checkIn();
        }
    }
}
