package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {

    static void main() throws IOException{
        Scanner scanner = new Scanner(System.in);
        FileWriter arquivo = new FileWriter("compras.txt");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nCompra " + (i + 1));
            System.out.println("Produto:");
            String produto = scanner.nextLine();
            System.out.println("Quantidade:");
            int quantidade = scanner.nextInt();
            System.out.println("Preço unitário:");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            arquivo.write(produto + ";" + quantidade + ";" + preco + "\n");
        }
        arquivo.close();

        System.out.println("\nRegistro:");
        File arquivoB = new File("compras.txt");
        Scanner leitor = new Scanner(arquivoB);

        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            System.out.println(linha);
        }
    }
}
