package Entities;

public class Helmet extends Armor {
    protected Console console;
    protected Synthesizer synthesizer;

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public Synthesizer getSynthesizer() {
        return synthesizer;
    }

    public void setSynthesizer(Synthesizer synthesizer) {
        this.synthesizer = synthesizer;
    }
}
