import java.util.Scanner;
public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("insira a temperatura em graus em fahrenheit: " );
		float fahrenheit = ent.nextFloat();
		System.out.println("a temperatura em graus celsius é de: " + (((fahrenheit - 32)*5)/9));
		ent.close();
				
	}

}
