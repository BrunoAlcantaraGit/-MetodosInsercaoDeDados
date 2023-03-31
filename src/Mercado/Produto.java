package Mercado;

import java.math.BigDecimal;

public class Produto {
    private  int idProduto;
    private  String nome;
    private BigDecimal valor;
    private int idSecao;

    public Produto(int idProduto,String nome, BigDecimal valor,int idSecao) {
        this.valor = valor;
        this.nome = nome;
        this.idProduto = idProduto;
        this.idSecao = idSecao;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdSecao() {
        return idSecao;
    }

    public void setIdSecao(int idSecao) {
        this.idSecao = idSecao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", idSecao=" + idSecao +
                '}';
    }
}
