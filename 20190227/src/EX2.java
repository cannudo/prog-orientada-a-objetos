import java.util.Arrays;
import java.util.Scanner;
public class EX2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Digite 10 valores inteiros, separados por Enter: ");
		for(int i = 0; i < 10; i++) {
			numeros[i] = entrada.nextInt();
		}
		Arrays.sort(numeros);
		System.out.println("Em ordem crescente, os valores digitados foram:");
		for(int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
		entrada.close();
		
	}
}
