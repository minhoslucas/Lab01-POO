/*
 * Evento.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Lucas Beserra - 281815
 */
public abstract class Evento {
    private String nome;
    private Local local;
    private ArrayList<Ingresso> ingressos_vendidos;
    private double precoIngresso;
    private LocalDate date;
    private LocalTime duration;

    /**
     * Construtor da classe Evento
     * @param nome o nome do Evento
     * @param local o local do Evento
     * @param ingressos_vendidos a lista de ingressos vendidos do Evento
     * @param precoIngresso o preço do ingresso do Evento
     * @param date a data do Evento
     * @param duration a duração do evento
     */
    public Evento(String nome, Local local,
                double precoIngresso, LocalDate date, LocalTime duration){
        this.nome = nome;
        this.local = local;
        this.ingressos_vendidos = new ArrayList<Ingresso>();
        this.precoIngresso = precoIngresso;
        this.date = date;
        this.duration = duration;
    }

    /**
     * Retorna o nome do Evento
     * @return o nome do Evento
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do Evento para `nome` 
     * @param nome o novo nome do Evento
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o preço do ingresso do Evento
     * @return o precoIngresso do Evento
     */
    public double getPrecoIngresso(){
        return precoIngresso;
    }

    /**
     * Altera o precoIngresso do Evento para `precoIngresso` 
     * @param precoIngresso o novo precoIngresso do Evento
     */
    public void setPrecoIngresso(double precoIngresso){
        this.precoIngresso = precoIngresso;
    }
    /**
     * Retorna o local do Evento
     * @return
     */
    public Local getLocal() {
        return this.local;
    }
    /**
     * Altera o local do Evento para `local`
     * @param local
     */

    public void setLocal(Local local) {
        this.local = local;
    }
    /**
     * Retorna o número de ingressos vendidos do Evento
     * @return
     */

    public int getIngressosVendidosQte(){
        return this.ingressos_vendidos.size();
    }
    /**
     * Retorna a lista de ingressos vendidos do Evento 
     * @return
     */

    public ArrayList<Ingresso> getIngressosVendidos(){
        return this.ingressos_vendidos;
    }
    
    /**
     * Altera a lista de ingressos vendidos para `ingressos_vendidos`
     * @param ingressos_vendidos
     */
    public void setIngressosVendidos(ArrayList<Ingresso> ingressos_vendidos) {
        this.ingressos_vendidos = ingressos_vendidos;
    }
    
    /**
     * Retorna a duração do evento
     * @return duration
     */
    public LocalTime getDuration() {
        return this.duration;
    }
    
    /**
     * Altera a duração do evento para `duration`
     * @param duration a duração do evento
     */
    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    /**
     * Retorna se True se o Evento está cheio
     * @return
     */
    private boolean isFull() {
        if (this.local.getCapacidade() == this.ingressos_vendidos.size()) {
            return true;
        }
        return false;
    }

    /**
     * Adiciona um ingresso à lista de ingressos vendidos e associa
     * ele à um usuário
     * @param ticket
     * @param user
     */
    public void adicionaIngresso(Ingresso ticket, Usuario user){
        if (!isFull()) {
            ingressos_vendidos.add(ticket);
            user.setTicket(ticket);
        } else {
            System.out.println("SOLD OUT");
        }
    } 

    /**
     * Retorna a data do Evento 
     * @return 
     */
    public LocalDate getData() {
        return this.date;
    }
    /**
     * Altera a data do evento para `date`
     * @param date
     */

    public void setData(LocalDate date) {
        this.date = date;
    }

    /**
     * Retorna o total faturado no Evento
     * @return
     */
    public double calculaFaturamento() {
        double total = 0;
        for (int i = 0; i < ingressos_vendidos.size(); i++) {
            total += ingressos_vendidos.get(i).getPreco();
        }
        return total;
    }
    /**
     * Imprime as informações do Evento
     */

    public abstract void showInfo();
}
