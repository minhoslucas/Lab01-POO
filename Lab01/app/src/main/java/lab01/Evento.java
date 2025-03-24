/*
 * Evento.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

package lab01;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Contém a estrutura de implementação de um Evento.
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 */
public abstract class Evento {
    private String nome;
    protected Local local;
    private ArrayList<Ingresso> ingressos_vendidos;
    private double precoIngresso;
    private LocalDate date;

    /**
     * Construtor da classe Evento
     * @param nome o nome do Evento
     * @param local o local associado ao Evento
     */
    public Evento(String nome, Local local, ArrayList<Ingresso> ingressos_vendidos, double precoIngresso, LocalDate date){
        this.nome = nome;
        this.local = local;
        this.ingressos_vendidos = ingressos_vendidos;
        this.precoIngresso = precoIngresso;
        this.date = date;
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

    public Local getLocal() {
        return this.local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public int getSoldTicketsAmnt(){
        return this.ingressos_vendidos.size();
    }

    public ArrayList<Ingresso> getSOldTickets(){
        return this.ingressos_vendidos;
    }

    private boolean isFull() {
        if (this.local.getCapacidade() == this.ingressos_vendidos.size()) {
            return true;
        }
        return false;
    }

    public void sellTicket(Ingresso ticket, Usuario user){
        if (!isFull()) {
            ingressos_vendidos.add(ticket);
            user.setTicket(ticket);
        } else {
            System.out.println("SOLD OUT");
        }
    } 

    public LocalDate getDate() {
        return this.date;
    }

    public double getTotalInvoice() {
        double total = 0;
        for (int i = 0; i < ingressos_vendidos.size(); i++) {
            total += ingressos_vendidos.get(i).getPreco();
        }
        return total;
    }

    public abstract void showInfo();
}
