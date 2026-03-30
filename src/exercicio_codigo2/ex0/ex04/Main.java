package exercicio_codigo2.ex0.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        System.out.println("Escolha a operacao: ");

        char operacao = input.next().charAt(0);
        double resultado;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("A soma deu: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("A subtracao deu: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("A multiplicacao deu: " + resultado);
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("Erro");
                } else {
                    resultado = (double) numero1 / numero2;
                    System.out.println(" A divisao deu: " + resultado);
                }
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }
    }
}
