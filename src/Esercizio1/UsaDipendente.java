package Esercizio1;

public class UsaDipendente {

    public static void main(String[] args) {
        Dipendente d1 = new Dipendente(123, 1700, Dipartimento.VENDITE);
        Dipendente d2 = new Dipendente(124, 1600, Dipartimento.AMMINISTRAZIONE);
        Dipendente d3 = new Dipendente(125, 1800, Dipartimento.PRODUZIONE);

        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0]=d1;
        dipendenti[1]=d2;
        dipendenti[2]=d3;

        for(int i=0; i<dipendenti.length;i++){
            System.out.println(dipendenti[i].getMatricola());
        }
    }
}
