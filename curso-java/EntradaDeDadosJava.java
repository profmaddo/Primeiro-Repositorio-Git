import java.util.Scanner;

class EntradaDeDadosJava {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Por favor, digite seu nome: ");
        
        String nome = scanner.nextLine();
        
        // Imprime o nome digitado
        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo da programação em Java.");
        
        // Fecha o scanner
        scanner.close();

    }

}