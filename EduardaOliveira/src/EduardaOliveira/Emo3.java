package EduardaOliveira;

import java.util.Scanner; 

public class Emo3 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO3- Maior de dois números");
		System.out.println("**********************************");
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite o primeiro número: ");
		 float num1 = scanner.nextFloat();
		 
		 System.out.println("Digite o segundo número: ");
		 float num2 = scanner.nextFloat();
		 
		 if (num1>num2) {
			 System.out.println("O maior número é: " + num1);
		 } else {
			 System.out.println("O maior número é: " + num2);
		 }
		 
		 scanner.close();
	}

}
