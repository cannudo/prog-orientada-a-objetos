import java.util.Scanner;
public class EX3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] pontos = new double[4];
		System.out.println("Digite, separando as entradas com a tecla ENTER, os valores de, respectivamente, X1, Y1, X2, Y2, no plano cartesiano:");
		for(int i = 0; i < 4; i++) {
			pontos[i] = input.nextInt();
		}
		double distance = Math.sqrt((pontos[2] - pontos[0]) * (pontos[2] - pontos[0]) + (pontos[1] - pontos[3]) * (pontos[1] - pontos[3]));
		System.out.println("A distância entre os dois pontos é " + String.format("%.2f", distance) + ".");
		input.close();
	}
}