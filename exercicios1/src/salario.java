import java.util.Scanner;
public class salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.print("sal�rio ganho por hora: ");
		float valor = ent.nextFloat();
		System.out.print("Horas trabalhadas por m�s: ");
		float Horas = ent.nextFloat();
		float dinheiro = valor*Horas;
		System.out.println("seu sal�rio por m�s �: " + dinheiro);
		ent.close();
			
	}

}
