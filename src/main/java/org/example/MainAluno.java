package org.example;

public class MainAluno {
    static void main() {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.matricula = 123;
        aluno.notaA = 7;
        aluno.notaB = 6.5;
        aluno.notaC = 8;

        aluno.varificarAprovacao();
    }
}
