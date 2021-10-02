import java.util.Scanner;
public class NumInteiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("insira o primeiro número inteiro");
		int num1 = ent.nextInt();
		System.out.println("insira o segundo número inteiro");
		int num2 = ent.nextInt();
		System.out.println("insira o número real");
		float num3 = ent.nextFloat();
		System.out.println("a soma do dobro do primeiro número com metade do segundo é: " + (num1*2)+(num2/2));
		System.out.println("a soma do triplo do primeiro com o terceiro é :" + (((num1)*3)+ num3));
		System.out.println(" e o terceiro elevado ao cubo é: " + (((num3)*num3)*num3));
		ent.close();
		
	}
		
				
	}

