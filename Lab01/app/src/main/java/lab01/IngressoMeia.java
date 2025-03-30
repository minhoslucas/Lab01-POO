package lab01;

/**
 * Classe que representa um ingresso meia-entrada para um evento. 
 * Esta classe herda de Ingresso e calcula o preço do ingresso com desconto de meia-entrada.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class IngressoMeia extends Ingresso {

    /**
     * Construtor da classe IngressoMeia. Inicializa o ingresso com o evento associado.
     * 
     * @param evento O evento para o qual o ingresso meia-entrada é válido.
     */
    public IngressoMeia(Evento evento) {
        super(evento);
    }

    /**
     * Retorna o preço do ingresso meia-entrada.  
     * @return O preço do ingresso meia-entrada, que é metade do preço original.
     */
    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso() / 2;
    }
}
