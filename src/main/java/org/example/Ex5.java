package org.example;

public class Ex5 {
    // Imprime um cabeçalho e uma página HTML com uma saudação.
    static void main() {
        System.out.println("Content-Type: text/html");
        // A linha vazia separa o cabeçalho do conteúdo HTML.
        System.out.println();
        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
