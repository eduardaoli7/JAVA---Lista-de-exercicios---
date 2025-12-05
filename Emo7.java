package EduardaOliveira;

import java.util.Scanner; 

public class Emo7 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO7- Triângulo válido");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo válido!");
        } else {
            System.out.println("Os lados NÃO formam um triângulo válido.");
        }

        scanner.close();

	}
}