package lab01;

/**
 * Classe que representa um ingresso VIP para um evento. 
 * Esta classe herda de Ingresso e calcula o preço do ingresso com o dobro do preço original.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Lucas Beserra - 281815
 */
public class IngressoVIP extends Ingresso {

    /**
     * Construtor da classe IngressoVIP. Inicializa o ingresso VIP com o evento associado.
     * 
     * @param evento O evento para o qual o ingresso VIP é válido.
     */
    public IngressoVIP(Evento evento) {
        super(evento);
    }

    /**
     * Retorna o preço do ingresso VIP. 
     * Este método retorna o dobro do preço do ingresso original, aplicando um acréscimo para a versão VIP.
     * 
     * @return O preço do ingresso VIP, que é o dobro do preço original do evento.
     */
    @Override
    public double getPreco() {
        return this.evento.getPrecoIngresso() * 2;
    }
}
