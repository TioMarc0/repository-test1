import java.util.Scanner;

public class sequenciais {

	public static void main(String[] args) {
		System.out.println("Digite o raio da circunferencia: ");
		Scanner scanner = new Scanner(System.in);
		float raio = scanner.nextFloat();
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A area da circunferencia é de: %.2f", area);
		scanner.close();
	}

}