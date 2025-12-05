package EduardaOliveira3;

public class Emo28 {
	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO28 - Soma dos pares entre 1 e 100");
		System.out.println("**********************************");
		 
		int i = 1;
		int pares = 0;
		
		while(i <= 100) {
			
			if (i % 2 == 0) {
				pares += i;;
			} 
			i++;
		}
		
		System.out.println("A soma dos números pares entre 1 e 100 é: " + pares);
	}
}