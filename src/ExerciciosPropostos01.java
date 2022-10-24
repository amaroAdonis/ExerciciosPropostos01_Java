import java.util.Locale;
import java.util.Scanner;

public class ExerciciosPropostos01 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

       /* Exercício 01
       int valor1 = sc.nextInt();
       int valor2 = sc.nextInt();
       int soma = valor1 + valor2;

        System.out.printf("SOMA = %d%n", soma);

        sc.close();*/

        /* Exercício 02
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double A = Math.pow(raio, 2);
        double area = pi * A;

        System.out.printf("A = %.4f%n", area);
        sc.close();
         */

        /*Exercício 03

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diferenca = (a*b) - (c*d);

        System.out.printf("DIFERENÇA = %d", diferenca);

        sc.close();
        */

        /*Exercício 04

        double numeroFuncionario = sc.nextDouble();
        double horasTrabalhadas = sc.nextDouble();
        double valorHora = sc.nextDouble();
        double salary = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = %.2f%n", salary);

        sc.close(); */

        /* Exercício 5

        double codigoPeca1 = sc.nextDouble();
        double quantidadePeca1 = sc.nextDouble();
        double valorUnitPeca1 = sc.nextDouble();
        double codigoPeca2 = sc.nextDouble();
        double quantidadePeca2 = sc.nextDouble();
        double valorUnitPeca2 = sc.nextDouble();
        double totalPeca1 = quantidadePeca1 * valorUnitPeca1;
        double totalPeca2 = quantidadePeca2 * valorUnitPeca2;
        double totalAPagar = totalPeca1 + totalPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalAPagar);

        sc.close();  */

        /*Exercicio 06

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double triangulo = (A * C)/2;
        double circulo = ((Math.pow(C,2)) * 3.14159);
        double trapezio = ((A+B)*C)/2;
        double quadrado = Math.pow(B,2); // Ou quadrado = B*B;
        double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close(); */


    }
}