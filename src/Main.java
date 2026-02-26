import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   //Desarrollar un algoritmo que permita determinar el estado nuticional de una persona de acurdo con su indice de masa corporal
        // IMC = peso/estatura(m)"2
   // De acurdo al IMC establesca la clasificacion de acurdo con:
        // Columan IMC columna 2 Sutiacion 1valor imc
        // menor a 18.5   peso bajo
        // 18.5 a 24.9    peso normal
        // 25 a 26.9      sobrepeso grado 1
        // 27 a 29.9      sobrepeso grado 2
        // 30 a 34.9      obecidad tipo 1
        // 35 a 39.9      obecidad tipo 2
        // 40 a 49,0      obecidad morvida
        // mayor a 50     obecidad extrema

        Scanner lector = new Scanner(System.in);
        double peso;
        double estatura;
        double imc;

        System.out.print("Esciba su peso: ");
        peso = lector.nextDouble();
        System.out.print("Esciba su estatura: ");
        estatura = lector.nextDouble();

        imc = peso / (estatura*estatura);

            if (imc < 18.5){
                System.out.println("Su IMC es: " + imc);
                System.out.println("Peso bajo");
            } else if (imc >=18.5 && imc <= 24.9 ) {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Peso normal");
            } else if (imc >=25 && imc <= 26.9) {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Sobrepeso - Grado 1");
            } else if (imc >=27  && imc <= 29.9) {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Sobrepeso - Grado 2");
            } else if (imc >=30 && imc <=34.9 ) {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Obecidad - Tipo 1");
            } else if (imc >=35 && imc <= 39.9) {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Obecidad - Tipo 2");
            } else if (imc >=40 && imc <= 49) {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Obecidad morvida");
            } else {
                System.out.println("Su IMC es: " + imc);
                System.out.println("Obecidad extrema");
            }


    }
}