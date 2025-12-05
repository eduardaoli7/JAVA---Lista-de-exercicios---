package EduardaOliveira2;

import java.util.Scanner;

public class Emo20 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO20 - Números de Fibonacci (n termos)");
		System.out.println("**********************************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite quantos termos da sequência de Fibonacci deseja ver: ");
        int n = scanner.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("\nOs " + n + " primeiros termos da sequência de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " "); 

            int proximo = primeiro + segundo; 
            primeiro = segundo;  
            segundo = proximo;  
        }

        scanner.close();
	}

}
