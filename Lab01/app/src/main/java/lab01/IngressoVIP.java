package lab01;

public class IngressoVIP extends Ingresso {
    /**
     * Construtor da classe IngressoVIP
     * @param evento o evento o qual o ingresso está relacionado
     */
    public IngressoVIP(Evento evento) {
        super(evento);
    }
    /**
     * Retorna o dobro do preço do Ingresso
     * @return o preço do ingresso
     */

    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso() * 2;
    }
}
