package EduardaOliveira;

import java.util.Scanner; 

public class Emo5 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO5- Notas e aprovação");
		System.out.println("**********************************");
		
		Scanner scanner =  new Scanner(System.in); 
		
		System.out.println("Digite a sua nota final do 1° bimestre: ");
		float num1 = scanner.nextFloat();
		System.out.println("Digite a sua nota final do 2° bimestre: ");
		float num2 = scanner.nextFloat();
		System.out.println("Digite a sua nota final do 3° bimestre: ");
		float num3 = scanner.nextFloat();
		System.out.println("Digite a sua nota final do 4° bimestre: ");
		float num4 = scanner.nextFloat();
		
		 float notaf= (num1 + num2 + num3 + num4) / 4;
		
		if (notaf>=6) {
			System.out.println("Parabéns! Você está APROVADO, sua nota final foi: " + notaf);
		} else { 
			System.out.println("Poxa, você foi REPROVADO! Sua nota final foi: " + notaf);
		}
		
		scanner.close();
	}
}