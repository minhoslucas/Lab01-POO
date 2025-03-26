package lab01;

public class IngressoMeia extends Ingresso{
    /**
     * Construtor da classe IngressoMeia
     * @param evento o evento o qual o ingresso está relacionado
     */
    public IngressoMeia(Evento evento) {
        super(evento);
    }
    /**
     * Retorna o preço do Ingresso dividido por dois
     * @return o preço do ingresso
     */
    
    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso() / 2;
    }

    
}