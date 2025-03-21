package lab01;

public class IngressoVIP extends Ingresso {
    public IngressoVIP(Evento evento) {
        super(evento);
    }

    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso() * 2;
    }
}
