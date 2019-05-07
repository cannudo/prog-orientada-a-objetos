import java.util.Arrays;
import java.util.Scanner;
public class EX3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.print("Quantos valores você deseja que eu ordene? ");
		n = entrada.nextInt();
		int[] numeros = new int[n];
		System.out.println("Digite " + n + " valores inteiros, separados por Enter: ");
		for(int i = 0; i < n; i++) {
			numeros[i] = entrada.nextInt();
		}
		Arrays.sort(numeros);
		System.out.println("Em ordem crescente, os valores digitados foram:");
		for(int i = 0; i < n; i++) {
			System.out.println(numeros[i]);
		}
		entrada.close();
		
	}
}