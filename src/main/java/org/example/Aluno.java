package org.example;

public class Aluno {
    String nome;
    int matricula;
    double notaA;
    double notaB;
    double notaC;

    public double calcularMedia(){
        double media = (notaA + notaB + notaC) / 3;
        return  media;
    }

    public void varificarAprovacao(){

        double media = calcularMedia();
        if (media >= 7){
            System.out.println("Aluno Aprovado");
        }else {
            System.out.println("Aluno Reprovado");
        }
    }
}
