import java.util.Scanner;
public class EX2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite 5 valores separados por Enter:");
		int entrada = leitor.nextInt();
		int maior = entrada, menor = entrada;
		for(int i = 0; i < 4; i++) {
			int valor = leitor.nextInt();
			if(valor < menor) {
				menor = valor;
			}
			if(valor > maior) {
				maior = valor;
			}
		}
		leitor.close();
		System.out.println("O maior valor é " + maior + " e o menor é " + menor);
	}
}