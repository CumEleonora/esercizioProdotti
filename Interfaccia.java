import java.util.ArrayList;
import java.util.Scanner;

public class Interfaccia{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);         //genero scanner

        Admin a1 = new Admin("Eleonora", 1234); //genero ADMIN

        boolean accesso = false;


        //creazione ListaUtenti
        ArrayList<Utente> ListaUtenti = new ArrayList<>();
        ListaUtenti.add(a1);                                        //aggiungo l'admin Eleonora nella ListaUtenti





        //fase 1: primo menu (accedi/registrati/exit)

        while (accesso = false) {                                   //l'azione si deve ripetere finchè non è stato fatto un accesso. Solo allora si può passare alla fase 2 (menu successivo)

             //stampa menu e fai scegliere l'azione all'utente
            System.out.println();
            System.out.println("1 - Accedi");
            System.out.println("2 - Registrati");
            System.out.println("3 - Esci");
            System.out.print("digita il numero:   ");
            int risposta = s.nextInt();

            //esegui la richiesta dell'utente

            switch (risposta) {
                case 1:
                    //accesso tramite nome utente e PIN con 3 tentativi
                        int tentativi = 3;
                        int guessPIN = 0;                              //variabile che "raccoglie" il PIN che inserisce l'utente
                        String guessNome;                               //variabile che "raccoglie" il nome che inserisce l'utente
                        boolean utenteEsiste = false;


                        do {
                            System.out.println("inserire il nome utente");
                            guessNome = s.nextLine();

                            for (Utente utente : ListaUtenti) {
                                if (guessNome.equals(utente.getNome())) {
                                    System.out.println("l'utente esiste");
                                    utenteEsiste = true;
                                }
                            }

                            System.out.println("l'utente non esiste");


                        } while (tentativi >0 && utenteEsiste==false);

                        if (utenteEsiste) {
                            do {
                                System.out.println("inserire il PIN");
                                guessPIN = s.nextInt();
                                tentativi--;
                            } while (tentativi >0 && guessPIN != a1.getPIN());
                            
                            if (guessPIN == a1.getPIN()) {
                                System.out.println("accesso eseguito");
                                accesso = true;
                    
                            } else {
                                System.out.println("accesso negato");
                            }
                            
                        } 

                    break;



                /*case 2:
                    c1.deposita();
                    break;
                case 3:
                    System.out.println("Arrivederci!");
                    System.exit(0);*/

            }

        }
       






        //fase 2: secondo menu
        //verifica se ADMIN/UTENTE
        //stampa il menu e fa scegliere. Ripete l'azione finchè non si sceglie exit.
        //admin ha più opzioni di utente. Devo decidere una delle due opzioni: il menu stampa tutte le possibili azioni ma se un utente ne sceglie una riservata admin, lo rimanda al menu; il menu stampa le azioni disponibili a seconda dell'utente/admin







    }//fine main

}

/*  MIGLIORAMENTI:
   creare una classe ContoCorrente
 */
