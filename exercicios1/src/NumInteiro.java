import java.util.Scanner;
public class NumInteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("insira o primeiro n�mero inteiro");
		int num1 = ent.nextInt();
		System.out.println("insira o segundo n�mero inteiro");
		int num2 = ent.nextInt();
		System.out.println("insira o n�mero real");
		float num3 = ent.nextFloat();
		System.out.println("a soma do dobro do primeiro n�mero com metade do segundo �: " + (num1*2)+(num2/2));
		System.out.println("a soma do triplo do primeiro com o terceiro � :" + (((num1)*3)+ num3));
		System.out.println(" e o terceiro elevado ao cubo �: " + (((num3)*num3)*num3));
		ent.close();
		
	}
		
				
	}

