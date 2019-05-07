import java.util.Scanner;
public class EX4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double media, nota1, nota2;
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		media = ((nota1 * 2) + (nota2 * 3)) / 5;
		System.out.println("Média: " + media);
		input.close();
	}
}
