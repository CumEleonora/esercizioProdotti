import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);         //genero scanner

        Utente u1 = new Utente("Eleonora", 1234); //genero ADMIN




        //fase 1: primo menu (accedi/registrati/exit)
        //stampa il menu e fa scegliere. Ripete l'azione finchè non si sceglie accedi o exit
        //codice accedi: Fa inserire nome e pin. ricerca nome utente nel catalogo utenti. Se non esiste, denies access. Se esiste, controlla che il pin corrisponda
        //codice registrati: crea un nuovo utente
        //exit: System.exit(0) può essere un metodo della classe main

        //fase 2: secondo menu
        //verifica se ADMIN/UTENTE
        //stampa il menu e fa scegliere. Ripete l'azione finchè non si sceglie exit.
        //admin ha più opzioni di utente. Devo decidere una delle due opzioni: il menu stampa tutte le possibili azioni ma se un utente ne sceglie una riservata admin, lo rimanda al menu; il menu stampa le azioni disponibili a seconda dell'utente/admin







    }//fine main

}

/*  MIGLIORAMENTI:
   creare una classe ContoCorrente
 */
