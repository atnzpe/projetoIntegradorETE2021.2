/*
 * 2. Criar um programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
 */

/**
 *
 * @author ALUNO
 */
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioTotal = 0;
        int nFuncionarios = 4;
        int cont = 0;
        while (cont < nFuncionarios) {
            System.out.println("Digite salario");
            double salario = input.nextDouble();
            salarioTotal += salario;
            cont++;
        }
        double media = salarioTotal / nFuncionarios;
        System.out.println("A média salarial para " + nFuncionarios + " funcionário(s) é " + "R$ " + media);
    }

}
