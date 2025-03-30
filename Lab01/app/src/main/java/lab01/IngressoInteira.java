package lab01;

/**
 * Classe que representa um ingresso inteiro para um evento. 
 * Esta classe herda de Ingresso e calcula o preço do ingresso inteiro sem desconto.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class IngressoInteira extends Ingresso {

    /**
     * Construtor da classe IngressoInteira. Inicializa o ingresso com o evento associado.
     * @param evento O evento para o qual o ingresso inteiro é válido.
     */
    public IngressoInteira(Evento evento) {
        super(evento);
    }

    /**
     * Retorna o preço do ingresso inteiro. 
     * @return O preço do ingresso inteiro.
     */
    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso();
    }
}

