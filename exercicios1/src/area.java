import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		System.out.print("insira o valor do quadrado: ");
		float area =ent.nextFloat();
		System.out.println("o valor do quadrado é: " + (area*area));
		ent.close();
		
		

	}

}
