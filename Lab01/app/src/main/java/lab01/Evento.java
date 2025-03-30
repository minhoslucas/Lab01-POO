/*
 * Evento.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

 package lab01;
 import java.time.LocalDate;
 import java.time.Duration;
 import java.util.ArrayList;
 
 /**
  * Classe abstrata que representa um Evento. Um evento pode ser de diferentes tipos, como Show, Festival, Esporte, etc.
  * Esta classe contém informações como nome, local, ingressos vendidos, preço do ingresso, data e duração do evento.
  * Comentários feitos por IA e corrigidos postreriormente
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
     private Duration duration;
 
     /**
      * Construtor da classe Evento. Inicializa os atributos de nome, local, preço do ingresso, data e duração do evento.
      * @param nome o nome do Evento
      * @param local o local do Evento
      * @param precoIngresso o preço do ingresso do Evento
      * @param date a data do Evento
      * @param duration a duração do Evento
      */
     public Evento(String nome, Local local, double precoIngresso, LocalDate date, Duration duration) {
         this.nome = nome;
         this.local = local;
         this.ingressos_vendidos = new ArrayList<Ingresso>();
         this.precoIngresso = precoIngresso;
         this.date = date;
         this.duration = duration;
     }
 
     /**
      * Retorna o nome do Evento.
      * @return o nome do Evento
      */
     public String getNome() {
         return nome;
     }
 
     /**
      * Altera o nome do Evento para o valor especificado.
      * @param nome o novo nome do Evento
      */
     public void setNome(String nome) {
         this.nome = nome;
     }
 
     /**
      * Retorna o preço do ingresso do Evento.
      * @return o preço do ingresso
      */
     public double getPrecoIngresso() {
         return precoIngresso;
     }
 
     /**
      * Altera o preço do ingresso do Evento para o valor especificado.
      * @param precoIngresso o novo preço do ingresso
      */
     public void setPrecoIngresso(double precoIngresso) {
         this.precoIngresso = precoIngresso;
     }
 
     /**
      * Retorna o local onde o Evento ocorre.
      * @return o local do Evento
      */
     public Local getLocal() {
         return this.local;
     }
 
     /**
      * Altera o local do Evento para o valor especificado.
      * @param local o novo local do Evento
      */
     public void setLocal(Local local) {
         this.local = local;
     }
 
     /**
      * Retorna o número de ingressos vendidos para o Evento.
      * @return o número de ingressos vendidos
      */
     public int getIngressosVendidosQte() {
         return this.ingressos_vendidos.size();
     }
 
     /**
      * Retorna a lista de ingressos vendidos para o Evento.
      * @return a lista de ingressos vendidos
      */
     public ArrayList<Ingresso> getIngressosVendidos() {
         return this.ingressos_vendidos;
     }
 
     /**
      * Altera a lista de ingressos vendidos do Evento para a lista especificada.
      * @param ingressos_vendidos a nova lista de ingressos vendidos
      */
     public void setIngressosVendidos(ArrayList<Ingresso> ingressos_vendidos) {
         this.ingressos_vendidos = ingressos_vendidos;
     }
 
     /**
      * Retorna a duração do Evento.
      * @return a duração do Evento
      */
     public Duration getDuration() {
         return this.duration;
     }
 
     /**
      * Altera a duração do Evento para o valor especificado.
      * @param duration a nova duração do Evento
      */
     public void setDuration(Duration duration) {
         this.duration = duration;
     }
 
     /**
      * Verifica se o Evento atingiu sua capacidade máxima de público.
      * @return true se o Evento está cheio, false caso contrário
      */
     private boolean isFull() {
         return this.local.getCapacidade() == this.ingressos_vendidos.size();
     }
 
     /**
      * Adiciona um ingresso à lista de ingressos vendidos e associa-o a um usuário.
      * Verifica se o Evento ainda tem ingressos disponíveis antes de realizar a venda.
      * @param ticket o ingresso a ser adicionado
      * @param user o usuário que está comprando o ingresso
      */
     public void adicionaIngresso(Ingresso ticket, Usuario user) {
         if (!isFull()) {
             ingressos_vendidos.add(ticket);
             user.setTicket(ticket);
         } else {
             System.out.println("SOLD OUT");
         }
     }
 
     /**
      * Retorna a data em que o Evento ocorre.
      * @return a data do Evento
      */
     public LocalDate getData() {
         return this.date;
     }
 
     /**
      * Altera a data do Evento para o valor especificado.
      * @param date a nova data do Evento
      */
     public void setData(LocalDate date) {
         this.date = date;
     }
 
     /**
      * Formata a duração do Evento em uma string no formato "H:M".
      * @param duration a duração do Evento
      * @return uma string representando a duração formatada
      */
     protected String formatDuration(Duration duration) {
         long conv = duration.toMinutes();
         long hrs = conv / 60;
         long min = conv % 60;
         return hrs + ":" + min + "\n";
     }
 
     /**
      * Calcula o faturamento total do Evento com base no número de ingressos vendidos e seus preços.
      * @return o total faturado pelo Evento
      */
     public double calculaFaturamento() {
         double total = 0;
         for (int i = 0; i < ingressos_vendidos.size(); i++) {
             total += ingressos_vendidos.get(i).getPreco();
         }
         return total;
     }
 
     /**
      * Método abstrato para imprimir as informações específicas do Evento.
      * Cada tipo de Evento (Show, Festival, Esporte, etc.) implementará este método de forma diferente.
      */
     public abstract void showInfo();
 
     /**
      * Retorna uma representação textual simplificada do Evento, usando o seu nome.
      * @return o nome do Evento
      */
     @Override
     public String toString() {
         return this.nome;
     }
 }
 
