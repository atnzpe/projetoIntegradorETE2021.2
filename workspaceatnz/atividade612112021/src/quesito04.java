/*
 * 4. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: 
 * V = 3.14159 * R * R * A, 
 * em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
 */

/**
 *
 * @author gleyson
 */
import java.util.Scanner;

public class quesito04 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double raioEaltura [] = new double [3];
   int i=0; 
while(i< 2){
    switch(i){
        case(0):
            System.out.println("Digite o Valor do Raio: ");
            raioEaltura[i] = input.nextDouble();
        case(1):
            System.out.println("Digite o Valor do Ângulo: ");
            raioEaltura[i] = input.nextDouble();
    }
    i++;
            
    }
}
    }

