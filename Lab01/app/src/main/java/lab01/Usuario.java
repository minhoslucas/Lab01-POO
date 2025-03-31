/*
 * Usuario.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */
package lab01;

/**
 * Classe que representa um usuário do sistema.
 * A classe contém o nome, email e ingresso do usuário.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Lucas Beserra - 281815
 */
public class Usuario {

    private String nome;
    private String email;
    private Ingresso ticket; 

    /**
     * Construtor da classe Usuário.
     * Inicializa o nome e email do usuário. O ingresso será atribuído posteriormente.
     * 
     * @param nome o nome do Usuário
     * @param email o e-mail do Usuário
     */
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    /**
     * Retorna o nome do usuário.
     * 
     * @return o nome do usuário
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do usuário para o valor especificado.
     * 
     * @param nome o novo nome do usuário
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o e-mail do usuário.
     * 
     * @return o e-mail do usuário
     */
    public String getEmail(){
        return email;
    }

    /**
     * Altera o e-mail do usuário para o valor especificado.
     * 
     * @param email o novo e-mail do usuário
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna o ingresso associado ao usuário.
     * 
     * @return o ingresso do usuário
     */
    public Ingresso getTicket() {
        return this.ticket;
    }

    /**
     * Altera o ingresso do usuário para o valor especificado.
     * 
     * @param ticket o novo ingresso do usuário
     */
    public void setTicket(Ingresso ticket) {
        this.ticket = ticket;
    }

    /**
     * Retorna uma representação do usuário como uma string.
     * A string é composta pelo nome e e-mail do usuário.
     * 
     * @return uma string representando o usuário no formato: "nome, email"
     */
    @Override
    public String toString() {
        return this.nome + ", " + this.email;
    }
}
