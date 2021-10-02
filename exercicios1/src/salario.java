import java.util.Scanner;
public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.print("salário ganho por hora: ");
		float valor = ent.nextFloat();
		System.out.print("Horas trabalhadas por mês: ");
		float Horas = ent.nextFloat();
		float dinheiro = valor*Horas;
		System.out.println("seu salário por mês é: " + dinheiro);
		ent.close();
			
	}

}
