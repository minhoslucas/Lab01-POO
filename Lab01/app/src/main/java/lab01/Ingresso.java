/*
 * Ingresso.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */

 package lab01;

 /**
  * Classe abstrata que representa um ingresso para um evento. Define a estrutura básica
  * de um ingresso, incluindo o evento ao qual ele está associado e o preço do ingresso.
  * As subclasses devem implementar a lógica para determinar o preço do ingresso.
  * Comentários feitos por IA e corrigidos posteriormente
  * 
  * @author Gabriel Leite - 216180
  * @author Caio Rhoden - 214129
  * @author Lucas Beserra - 281815
  */
 public abstract class Ingresso {
 
     /** O evento associado ao ingresso. */
     protected Evento evento;
 
     /**
      * Construtor da classe Ingresso. Inicializa o ingresso com um evento associado.
      * 
      * @param evento O evento para o qual o ingresso é válido.
      */
     public Ingresso(Evento evento){
         this.evento = evento;
     }
 
     /**
      * Retorna o evento associado a este ingresso.
      * 
      * @return O evento associado ao ingresso.
      */
     public Evento getEvento() {
         return this.evento;
     }
 
     /**
      * Define o evento associado a este ingresso.
      * 
      * @param evento O novo evento a ser associado ao ingresso.
      */
     public void setEvento(Evento evento) {
         this.evento = evento;
     }
 
     /**
      * Método abstrato que deve ser implementado pelas subclasses para retornar o preço do ingresso.
      * 
      * @return O preço do ingresso.
      */
     public abstract double getPreco();
 
     /**
      * Método sobrescrito que retorna uma representação textual do ingresso. Exibe o nome do evento,
      * o local, a data e o preço formatado do ingresso.
      * 
      * @return Uma string com as informações detalhadas sobre o ingresso.
      */
     @Override
     public String toString() {
         return "INGRESSO VÁLIDO PARA: \n"
         + this.evento.getNome() + "\n" 
         + this.evento.getLocal() + "\n"
         + this.evento.getData() + "\n"
         + String.format("%,.2f", this.getPreco()) + "\n";
     }
 }
 
