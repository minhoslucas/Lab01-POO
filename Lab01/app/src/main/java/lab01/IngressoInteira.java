package lab01;

public class IngressoInteira extends Ingresso{
    /**
     * Construtor da classe IngressoInteira
     * @param evento o evento o qual o ingresso está relacionado
     */
    public IngressoInteira(Evento evento) {
        super(evento);
    }
    /**
     * Retorna o preço do Ingresso
     * @return
     */

    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso();
    }
}
