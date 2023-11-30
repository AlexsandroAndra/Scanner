package Scanner;

public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = teclado.next();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();

        System.out.println("informações digitadas foram : " + "Nome: " +nome + " Idade: " +idade);


    }
}
