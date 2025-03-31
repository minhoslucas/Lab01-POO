/*
 * Local.java
 * 
 * Material usado na disciplina MC322 - Programação orientada a objetos.
 */
package lab01;

/**
 * Classe que representa um local onde eventos podem acontecer.
 * A classe contém o nome e a capacidade do local.
 * Comentários feitos por IA e corrigidos posteriormente
 * 
 * @author Gabriel Leite - 216180
 * @author Caio Rhoden - 214129
 * @author Lucas Beserra - 281815
 */
public class Local {
    private String nome;
    private double capacidade;

    /**
     * Construtor da classe Local.
     * Inicializa o local com o nome e a capacidade fornecidos.
     * 
     * @param nome o nome do local
     * @param capacidade a capacidade do local (número de pessoas que pode acomodar)
     */
    public Local(String nome, double capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    /**
     * Retorna o nome do local.
     * 
     * @return o nome do local
     */
    public String getNome(){
        return nome;
    }

    /**
     * Altera o nome do local.
     * 
     * @param nome o novo nome do local
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna a capacidade do local.
     * 
     * @return a capacidade do local
     */
    public double getCapacidade(){
        return capacidade;
    }
    
    /**
     * Altera a capacidade do local.
     * 
     * @param capacidade a nova capacidade do local
     */
    public void setCapacidade(double capacidade){
        this.capacidade = capacidade;
    }

    /**
     * Retorna uma representação em formato de string do local.
     * A string será composta pelo nome do local e sua capacidade.
     * 
     * @return uma string representando o local no formato: "nome (capacidade)"
     */
    @Override
    public String toString() {
        return this.nome
        + " (" + this.capacidade + ")";
    }
}
