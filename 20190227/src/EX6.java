import java.util.Scanner;

public class EX6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] notas = new double[20];
		double teste;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + " nota: ");
			notas[i] = entrada.nextDouble();
		}
		System.out.print("Agora, digite uma nota para comparação: ");
		teste = entrada.nextDouble();
		for(int i = 0; i < notas.length - 1; i++) {
			for (int j = i + 1; j < notas.length; j++) {
				if(notas[j] > notas[i]) {
					double foo = notas[j];
					notas[j] = notas[i];
					notas[i] = foo;
				}
			}
		}
		if(teste <= notas[0] && teste <= notas[9]) {
			System.out.println("O caso de teste está entre as piores notas.");
		} else {
			System.out.println("O caso de teste está entre as melhores notas.");
		}
		entrada.close();
	}
}