import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Concessionaria conc = new Concessionaria();
		int i = 4;  
		while (i > 0) {
			String marca = input.nextLine();
			String cor = input.nextLine();
			Carro carro = new Carro(marca, cor);
			conc.addCarro(carro);
			i--;
		}
		Carro[] lista = conc.getCarros();
		
		for (int j = 0; j < lista.length; j++) {
			if (lista[j] != null) {
				System.out.println(lista[j].getMarca());
			}
		}
	}
}