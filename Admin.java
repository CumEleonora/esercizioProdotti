public class Admin extends Utente{
    
    public Admin(String nome, int PIN){
        super(nome, PIN);
    }

    public boolean eamministratore(){                   //nel main, servirà per verificare se l'utente è anche admin. probabilmente esiste un modo per verificare l'identità di un oggetto, poi lo cercherò
        return true;
    }
}
