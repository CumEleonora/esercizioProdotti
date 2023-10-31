public class Utente {
    private String nome;
    private int PIN;

    public Utente(String nome, int PIN){
        this.nome = nome;
        this.PIN = PIN;
    }

    public String getNome(){
        return nome;
    }
    public int getPIN(){
        return PIN;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPIN(int PIN){
        this.PIN = PIN;
    }
}
