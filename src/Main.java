import Mercado.CriandoConexao;
import Mercado.ManipularDados;
import Mercado.Secao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner snc = new Scanner(System.in);
        Connection connection = CriandoConexao.getConnection();
        ManipularDados manipularDados = new  ManipularDados ();
        //manipularDados.consultarTbSecao();
        //manipularDados.consultarTbProduto();

        //manipularDados.inserirProduto();


    }
}