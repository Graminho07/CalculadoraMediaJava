// calculadora média java

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua nota do primeiro trimestre: ");
        int primeiraNota = scanner.nextInt();

        System.out.println("Digite sua nota do segundo trimestre: ");
        int segundaNota = scanner.nextInt();

        System.out.println("Digite sua nota do terceiro trimestre: ");
        int terceiraNota = scanner.nextInt();

        float mediaFinal = (primeiraNota + segundaNota + terceiraNota) / 3f;

        if (mediaFinal < 7) {
            System.out.println(nome + ", você ficou abaixo da média");
        }
        else if (mediaFinal >= 7 && mediaFinal < 10){
            System.out.println(nome + ", você ficou acima da média");
        }
        else {
            System.out.println(nome + ", você tirou nota máxima");
        }

        scanner.close();
    }
}