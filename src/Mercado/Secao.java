package Mercado;

public class Secao {
    private double idSessao;
    private String nome;


    public Secao(String nome, double idSessao) {
        this.nome = nome;
        this.idSessao = idSessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(double idSessao) {
        this.idSessao = idSessao;
    }

    @Override
    public String toString() {
        return "Secao{" +
                "idSessao=" + idSessao +
                ", nome='" + nome + '\'' +
                '}';
    }
}
