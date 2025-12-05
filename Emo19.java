package EduardaOliveira2;

import java.util.Scanner; 

public class Emo19 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO19 - Verificar se um número é primo");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        boolean primo = true; 

        if (numero <= 1) {
            primo = false; 
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false; 
                    break; 
                }
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();

	}

}
