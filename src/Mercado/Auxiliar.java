package Mercado;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Auxiliar {
Main main = new Main();
Scanner scanner = new Scanner(System.in);
public void voltarTela() throws Exception {

    Main main = new Main();
    System.out.println("Deseja voltar a tela inicial, S/N ? ");
    String voltar = scanner.nextLine();
    if(voltar.equalsIgnoreCase("S")){
        Main.main(null);
    }

}

}
