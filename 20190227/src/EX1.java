import java.util.Scanner;
public class EX1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		System.out.println("Digite 10 valores inteiros, separados por Enter: ");
		for(int i = 0; i < 10; i++) {
			numeros[i] = entrada.nextInt();
		}
		System.out.println("Os valores digitados foram:");
		for(int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
		entrada.close();
	}
}
