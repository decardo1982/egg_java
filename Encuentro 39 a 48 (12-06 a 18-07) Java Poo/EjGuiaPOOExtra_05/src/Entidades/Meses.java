package Entidades;

public class Meses {
    
    String[] doceMeses = new String[12];
    
    
    String mesSecreto;

    public Meses() {
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getDoceMeses() {
        return doceMeses;
    }

    public void setDoceMeses(String[] doceMeses) {
        this.doceMeses = doceMeses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
}
