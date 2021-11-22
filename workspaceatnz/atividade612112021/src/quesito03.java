/*
 * Uma parede em formato retangular, 
 * cuja altura é hp (altura da parede) e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares. 
 * O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). 
 * Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
 * calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.
 */

/**
 *
 * @author gleyson atanazio
 */
import java.util.Scanner;

public class quesito03 {

    public static void main(String[] args) {
        System.out.println("-Cálculo Azulejos para uma Parede -");
        Scanner in = new Scanner(System.in);

        int cont = 0, i = 1;
        double alturaLarguraParede[] = new double[2];
        double alturaLarguraAzulejo[] = new double[2];

        while (cont < 2) {
            System.out.println("<-- Digite o Tamanho da Parede -->%n%n");
            System.out.println("Digite  " + i + "º" + " lado: ");
            alturaLarguraParede[cont] = in.nextDouble();
            cont++;
            i++;
        }
        i = 1;
        cont = 0;
        while (cont < 2) {
            System.out.println("<-- Digite o Tamanho do Azulejo -->");
            System.out.println("Digite  " + i + "º" + " lado: ");
            alturaLarguraAzulejo[cont] = in.nextDouble();
            cont++;
            i++;
        }
        double qtdAzulejos = (alturaLarguraParede[0] * alturaLarguraParede[1]) / (alturaLarguraAzulejo[0] * alturaLarguraAzulejo[1]);
        System.out.println("A quantidade necessária de azulejos é de:  " + qtdAzulejos);
    }
}
