package org.example;

public class Aluno {
    String nome;
    int matricula;
    double notaA;
    double notaB;
    double notaC;

    // Calcula a média das três notas.
    public double calcularMedia(){
        double media = (notaA + notaB + notaC) / 3;
        return  media;
    }

    // Mostra se o aluno foi aprovado, usando a média mínima de 7.
    public void varificarAprovacao(){

        double media = calcularMedia();
        if (media >= 7){
            System.out.println("Aluno Aprovado");
        }else {
            System.out.println("Aluno Reprovado");
        }
    }
}
