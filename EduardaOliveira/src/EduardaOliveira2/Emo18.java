package EduardaOliveira2;

public class Emo18 {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Aluna: Eduarda Moreira de Oliveira");
		System.out.println("RA- 0024023");
		System.out.println("Classe EMO18 - Múltiplos de 3 entre 1 e 30");
		System.out.println("**********************************");
		
		System.out.println("Múltiplos de 3 entre 1 e 30\n");
		
		for(int i=1; i<=30; i++) {
			if(i % 3 == 0) {
				System.out.println("Os múltiplos são " + i);
			}
		}
	}
}
