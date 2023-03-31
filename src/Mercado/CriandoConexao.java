package Mercado;

import java.sql.DriverManager;
import java.sql.Connection;

public class CriandoConexao {

    public static Connection getConnection(){
        try{
        final String url = "jdbc:postgresql://localhost:5432/MercadoModerna";
        final String usuario = "postgres";
        final String senha = "root";

            return DriverManager.getConnection(url,usuario,senha);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
