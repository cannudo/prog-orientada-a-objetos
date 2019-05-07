import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[5];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i+1) + "º valor: ");
			numeros[i] = entrada.nextInt();
		}
		for(int i = 0; i < numeros.length - 1; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] > numeros[i]) {
					int foo = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = foo;
				}
			}
		}
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
	}
}