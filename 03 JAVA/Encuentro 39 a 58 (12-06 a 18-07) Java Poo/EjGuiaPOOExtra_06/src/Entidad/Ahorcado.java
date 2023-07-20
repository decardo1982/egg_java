package Entidad;

public class Ahorcado {

    private char[] Palabra;

    private int letrasEncontradas;

    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(char[] Palabra, int letrasEncontradas, int jugadasMaximas) {
        this.Palabra = Palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabra() {
        return Palabra;
    }

    public void setPalabra(char[] Palabra) {
        this.Palabra = Palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

}
