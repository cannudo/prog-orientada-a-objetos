import java.util.Scanner;

public class EX5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[2 + 8];
		int indice = 0;
		while(indice < 10) {
			if(indice < 2) {
			System.out.print("Digite o " + (indice + 1) + "º número: ");
			numeros[indice] = entrada.nextInt();
			indice++;
			} else {
				numeros[indice] = numeros[indice - 1] + numeros[indice - 2];
				indice++;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		entrada.close();
	}
}