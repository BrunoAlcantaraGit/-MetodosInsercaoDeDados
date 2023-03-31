package Mercado;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipularDados {


//Metodo deletarTabela não funciona
public void deletarTabela () throws SQLException {
String sql = "DELETE FROM pessoas WHERE codigo =";

Connection connection = CriandoConexao.getConnection();
Statement statement = connection.createStatement();
    int resultado = statement.executeUpdate(sql);

    if(resultado > 0){
        System.out.println("deletado com sucesso");

    }else {
        System.out.println("Nenhum elemento encontrato ");
    }
}
//não utilizar o métodeo a deletarTabela

public void inserirSecao() throws SQLException{

    System.out.println(" informa o nome da sessão");
     Scanner scanner = new Scanner(System.in);
    String nome = scanner.nextLine();
    String inserirSecao ="Insert into " +
            "secao_tb" +
            "(nome)" +
            "values" +
            "(?)";
    Connection connection = CriandoConexao.getConnection();
    PreparedStatement statement = connection.prepareStatement(inserirSecao);
    statement.setString(1,nome);
    statement.execute();
    statement.close();
    System.out.println("Sessão criada com sucesso");

}
public void inserirProduto() throws SQLException{
    System.out.println("informe os dados do Produto");
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nome do produto");
    String nome = scanner.nextLine();

    System.out.println("Valor do produto");
    BigDecimal valor = scanner.nextBigDecimal();
    scanner.nextLine();

    System.out.println("id da secao");
    int idSecao =scanner.nextInt();
    scanner.nextLine();

    String inserirProduto = "insert into  " +
            "produto_tb" +
            "(nome,valor,id_secao)" +
            "values" +
            "(?,?,?)";
Connection connection = CriandoConexao.getConnection();
PreparedStatement statement = connection.prepareStatement(inserirProduto);
statement.setString(1,nome);
statement.setBigDecimal(2, valor);
statement.setInt(3,idSecao);

statement.execute();
statement.close();
    System.out.println("Produto inserido com sucesso");
}

public void consultarTbSecao () throws SQLException{
    List<Secao> secao= new ArrayList<>();
    String consulta = "SELECT * FROM secao_tb";

    Connection connection = CriandoConexao.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultado = statement.executeQuery(consulta);

    while(resultado.next()){
        final String nome = resultado.getString("nome");
        final int idSecao = resultado.getInt("id_secao");
        secao.add(new Secao(nome,idSecao));

    }
    for(int i = 0; i < secao.size(); i++){
        System.out.println(secao.get(i));
    }
    statement.close();
    connection.close();
}

    public void consultarTbProduto () throws SQLException{
    String consulta = "SELECT * FROM produto_tb";
    List<Produto>produto = new ArrayList<>();

    Connection connection = CriandoConexao.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(consulta);

    while (resultSet.next()){
        int idProduto = resultSet.getInt("id_produto");
        String nome = resultSet.getString("nome");
        BigDecimal valor = resultSet.getBigDecimal("valor");
        int idsecao = resultSet.getInt("id_secao");

        produto.add(new Produto(idProduto,nome,valor,idsecao));
    }
for (int i = 0; i < produto.size(); i++){
    System.out.println(produto.get(i));
}
connection.close();
statement.close();
}

}
