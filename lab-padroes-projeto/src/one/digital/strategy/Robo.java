package one.digital.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento (Comportamento comportamento_) {
        this.comportamento = comportamento_;
    }

    public void mover() {
        comportamento.mover();
    }
}
