import java.util.Scanner;
public class EX1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, y;
		System.out.print("Digite um número inteiro: ");
		x = leitor.nextInt();
		System.out.print("Digite outro número inteiro: ");
		y = leitor.nextInt();
		leitor.close();
		if(x == y) {
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("Os números são diferentes.");
		}
	}
}
