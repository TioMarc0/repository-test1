import java.util.Scanner;
public class pesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.print("Qual seu Sexo? digite 1 para feminino ou  2 para masculino: ");
		int sexo = ent.nextInt();
		System.out.println("Sua altura: ");
		float altura = ent.nextFloat();
		if (sexo ==1) {
		System.out.println("o seu peso ideal é : " + ((altura*72.7)-58));
		}
		else {
			System.out.println("o seu peso ideal é de :" + ((altura*62.1)-44.7));
			ent.close();
		}
		
		

	}

}
