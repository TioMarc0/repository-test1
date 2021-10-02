import java.util.Scanner;
public class peixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		float excede = 0;
		float Multa = 0;
		System.out.print("Qual o peso: ");
		float peso = ent.nextFloat();
		
		if (peso > 50) {
			excede = (peso-50);
			Multa = (excede*4);
			System.out.println("o peso que excede tem o valor de: " + excede);
			System.out.println("o valor da multa é de: " +  Multa);
			ent.close();
			
		}
		
	}

}
